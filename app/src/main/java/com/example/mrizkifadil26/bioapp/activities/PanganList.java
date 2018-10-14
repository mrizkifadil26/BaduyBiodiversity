package com.example.mrizkifadil26.bioapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.mrizkifadil26.bioapp.R;
import com.example.mrizkifadil26.bioapp.adapter.PanganAdapter;
import com.example.mrizkifadil26.bioapp.model.Pangan;

import java.util.ArrayList;

public class PanganList extends AppCompatActivity {

    private static final String TAG = "PanganList";

    ArrayList<Pangan> mPangan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pangan_list);

        Log.d(TAG, "onCreate: started");

        setTitle("Tanaman Pangan");
        initImages();
    }

    private void initImages() {
        Log.d(TAG, "initImages: preparing");

        mPangan.add(new Pangan(1, "Cau Abu", "Musa Paradisiaca L.", "Musaceae", "Bunga:\n" +
                "Disayur santen, Ditumis, Disambel, Dimakan Langsung, Direbus, Dikukus\n" +
                "Buah:\n" +
                "Diperam hingga masak, Digoreng pakai tepung atau tidak, Direbus, Dikukus, Dibakar.", "Daun:\n" +
                "Untuk pembungkus", "0.33", R.drawable.ic_biologo_480));

        mPangan.add(new Pangan(2, "Cau paray", "Musa Paradisiaca L.", "Musaceae", "Buah: diperam hingga masak, dimakan langsung", "Daun: untuk pembungkus", "0.33", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(3, "Cau emas", "Musa Paradisiaca L.", "Musaceae", "Buah: diperam hingga masak, dimakan langsung", "Daun: untuk pembungkus", "0.33", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(4, "Tundun/Rambutan", "Nephelium lappaceum L.", "Sapindaceae", "Buah: dimakan langsung", "Daun: dikompres untuk penurun panas", "0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(5, "Ranji", "Dialium indum L.", "Fabaceae", "Buah: dimakan langsung", "-", "0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(6, "Cau galek", "Musa Paradisiaca L.", "Musaceae", "Buah: diperam hingga masak, dimakan langsung", "Daun: untuk pembungkus", "0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(7, "Cengkaleng/ kawung/aren", "Arenga pinnata Merr.", "Arecaceae", "Tuak : dibuat gul kawung; \n" +
                "Batang : dibuat sagu; \n" +
                "Batang muda/Birus : dimakan langsung, disayur bening, sayur santen; \n" +
                "Buah : dibuat campuran minuman", "-", "0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(8, "Pandan", "Pandanus amaryllifolius Roxb.", "Pandanaceae", "Pewangi dan bumbu", "-", "0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(9, "Cau paray", "Musa Paradisiaca L.", "Musaceae", "Buah langsung dimakan", "Daun untuk pembungkus", "0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(10, "Taleus bogor", "Colocasia gigantea Hook.", "Araceae", "Umbi : direbus, dikukus, digoreng, dibakar; \n" + "Batang muda/Birus : disayur bening", "-", "0.16", R.drawable.ic_biologo_480));

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: initializing.");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        PanganAdapter mAdapter = new PanganAdapter(this, mPangan);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
