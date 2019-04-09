package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class SearchResults extends AppCompatActivity {
    CustomerDetails customerDetails = new CustomerDetails();
    Collection collection = new Collection();
    public static FragmentManager fragmentManager;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.cust_details:
                    if(findViewById(R.id.results_container)!=null){
                      return true;
                    }
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, customerDetails, null);
                    fragmentTransaction.commit();
                    return true;
                case R.id.collection:

                    FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
                    fragmentTransaction1.replace(R.id.fragment_container, collection, null);
                    fragmentTransaction1.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);
        fragmentManager = getSupportFragmentManager();
        if(findViewById(R.id.results_container)!=null){
            if(savedInstanceState!=null){
                return;
            }
        }
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, customerDetails, null);
        fragmentTransaction.commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
