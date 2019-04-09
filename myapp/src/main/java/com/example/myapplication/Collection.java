package com.example.myapplication;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.adapter.ViewPagerAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class Collection extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public Collection() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.e("frag", "coll");

        View view = inflater.inflate(R.layout.fragment_collection, container, false);
        tabLayout =(TabLayout) view.findViewById(R.id.tab_layout);
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getFragmentManager());
        adapter.AddFragment(new CollectionHistory(), "Collection History");
        adapter.AddFragment(new CustomerOrderHIstory(), "Customer Order History");
        adapter.AddFragment(new AddCustomerOrder(), "Add Customer Order");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

}
