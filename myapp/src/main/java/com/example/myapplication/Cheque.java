package com.example.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Cheque extends Fragment {
    TableLayout table;

    public Cheque() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("frag", "cheque");
        View view = inflater.inflate(R.layout.fragment_cheque, container, false);
//        table = (TableLayout) view.findViewById(R.id.cheque_table);
        return view;
    }

}
