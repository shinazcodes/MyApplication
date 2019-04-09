package com.example.myapplication;


import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.example.myapplication.adapter.PageAdapter;
import com.example.myapplication.adapter.ReceiptTypeAdapter;
import com.example.myapplication.adapter.ViewPagerAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerDetails extends Fragment {
    private TabLayout tabLayout1;
    private ViewPager viewPager1;
    private ReceiptTypeAdapter adapter;

    public CustomerDetails() {
        // Required empty public constructor
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("frag", "cust");

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_customer_details, container, false);
        Toolbar toolbar;
//        toolbar = view.findViewById(R.id.toolbar);
//        toolbar.setTitle("shinaz");
        TabLayout tabLayout = view.findViewById(R.id.tablayout);
        ViewPager viewPager = view.findViewById(R.id.viewPager);
        adapter = new ReceiptTypeAdapter(getChildFragmentManager());
        adapter.AddFragment(new Bank(), "Bank");
        adapter.AddFragment(new Cheque(), "Cheque");
        viewPager.setAdapter(adapter);
//        assert tabLayout1 != null;
//        tabLayout1.setupWithViewPager(viewPager1);
//        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout1));
//        tabLayout1.setSelected(true);

//        PageAdapter pageAdapter = new PageAdapter(getFragmentManager(), tabLayout.getTabCount());
//        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        return view;
    }
}
