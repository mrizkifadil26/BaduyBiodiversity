package com.example.mrizkifadil26.bioapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.mrizkifadil26.bioapp.R;
import com.example.mrizkifadil26.bioapp.adapter.JamurAdapter;
import com.example.mrizkifadil26.bioapp.model.Jamur;

import java.util.ArrayList;

public class JamurList extends AppCompatActivity {

    private static final String TAG = "JamurList";

    ArrayList<Jamur> mJamur = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamur_list);

        Log.d(TAG, "onCreate: started");

        setTitle("Tanaman Jamur");
        prepareData();
    }

    private void prepareData() {
        Log.d(TAG, "prepareData: preparing.");

        mJamur.add(new Jamur(1, "Supa Cau", "Lentinus sp.", "Lentinus", "Di tanah, Di daerah ladang Cikartawana", "Dapat dikonsumsi", "0.03", R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(2, "Supa Bereum", "Pycnoporus sp.", "Pycnoporus", "Di tanah, Di daerah ladang cikartawana", "Dapat digunakan sebagai obat bengkak", "0.03", R.drawable.ic_biologo_480));

        initRecyclerJamur();
    }

    private void initRecyclerJamur() {
        Log.d(TAG, "initRecyclerJamur: initializing.");

        RecyclerView recyclerJamur = (RecyclerView) findViewById(R.id.recycler_jamur);
        JamurAdapter mAdapter = new JamurAdapter(this, mJamur);
        recyclerJamur.setAdapter(mAdapter);
        recyclerJamur.setLayoutManager(new LinearLayoutManager(this));
    }
}
