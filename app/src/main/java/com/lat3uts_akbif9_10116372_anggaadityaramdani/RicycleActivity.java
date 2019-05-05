package com.lat3uts_akbif9_10116372_anggaadityaramdani;

/*3-April-2019
  10115372
  Akb-if9
  Angga Aditya Ramdani
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RicycleActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> description = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ricycle);

        id.clear();
        title.clear();
        description.clear();

        id.add("1");
        title.add("Bermain Pubg mobile");
        description.add("Enjoy And Play More");

        recyclerView = findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        mAdapter = new RecyclerAdapter(getApplicationContext(), id, title, description);
        recyclerView.setAdapter(mAdapter);
    }
}