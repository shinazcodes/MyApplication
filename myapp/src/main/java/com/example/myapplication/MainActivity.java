package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView search_box;
    ArrayList customers = new ArrayList();
    Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search_box = findViewById(R.id.search);
        customers.add("shinaz");
        search = findViewById(R.id.button);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, customers);
        search_box.setAdapter(arrayAdapter);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchResults.class);
                startActivity(intent);
                intent.putExtra("name", "shinaz");
            }
        });
    }
}
