package com.example.myapplication.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.myapplication.Bank;
import com.example.myapplication.Cheque;

import java.util.ArrayList;
import java.util.List;

public class ReceiptTypeAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentlist1 = new ArrayList<>();
    private final List<String> pageTitle1  =  new ArrayList<>();

    public ReceiptTypeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Bank();
            case 1:
                return new Cheque();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitle1.get(position);
    }

    public void AddFragment(Fragment fragment, String title) {
        fragmentlist1.add(fragment);
        pageTitle1.add(title);
    }
}


