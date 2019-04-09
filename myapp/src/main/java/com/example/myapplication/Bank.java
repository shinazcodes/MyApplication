package com.example.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Bank extends Fragment {

    TableLayout table;
    public Bank() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("frag", "bank");
        View view = inflater.inflate(R.layout.fragment_bank, container, false);
        return view;
    }

}
