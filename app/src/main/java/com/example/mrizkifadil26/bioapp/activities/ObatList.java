package com.example.mrizkifadil26.bioapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.mrizkifadil26.bioapp.R;
import com.example.mrizkifadil26.bioapp.adapter.ObatAdapter;
import com.example.mrizkifadil26.bioapp.model.Obat;

import java.util.ArrayList;

public class ObatList extends AppCompatActivity {

    private static final String TAG = "ObatList";

    ArrayList<Obat> mObat = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat_list);

        Log.d(TAG, "onCreate: started");

        setTitle("Tanaman Obat");
        prepareData();
    }

    private void prepareData() {
        Log.d(TAG, "prepareData: preparing.");

        mObat.add(new Obat(1, "Rane", "Selaginella willdenowii Baker.", "Selaginellaceae", "Untuk khitanan, obat sariawan, obat sakit badan", "Daun, batang", "Dicampur dengan umbi kencur dan jahe, dikunyah dan diletakkan di kemaluan", "0.1", R.drawable.rane_1));
        mObat.add(new Obat(2, "Jukut Wisa", "Achyranthes aspera L.", "Amaranthaceae", "Digigit ular", "Daun", "Ditumbuk dan balurkan ke luka", "0.03", R.drawable.jukut_wisa_1));
        mObat.add(new Obat(3, "Hareundang", "Clidemia hirta", "Melastomataceae", "Radang", "Daun", "Ditumbuk dan dioleskan", "0.03", R.drawable.hareundang_1));
        mObat.add(new Obat(4, "Palumpung", "Merremia peltata (L.) Merr", "Convolvulaceae", "Agar perut bayi kuat, Obat batuk, Obat cacingan", "Daun", "Dileumpeuh dauunnya dan diletakkan di perut bayi atau dicampur dengan daun mara kemudian di rebus dan airnya diminum", "0.1", R.drawable.palumpung_1));
        mObat.add(new Obat(5, "Jukut Bau", "Ageratum conyzoides", "Asteraceae", "Obat mag, Obat masuk angin, Obat sakit badan, Obat masuk angin, Obat sakit kepala, sakit panas.", "Daun", "Daun harendong, capeutuheur, jukut bau, dan mara di rebus dan airnya diminum", "0.2", R.drawable.jukut_bau_1));
        mObat.add(new Obat(6, "Mara", "Macaranga sp.", "Euphorbiaceae", "Obat maag, Agar perut bayi kuat, Agar air nira tambah segar", "Daun", "Daun harendong, capeutuheur, jukut bau, dama ara di rebus dan airnya diminum", "0.1", R.drawable.mara));
        mObat.add(new Obat(7, "Pacing", "Costus specious", "Zingiberaceae", "Di gigit ular, Obat bisul, Obat luka.", "Batang", "Dipupuy dibuih di oleskan, atau ditambah jukut wisa, jukut wisa", "0.1", R.drawable.pacing_1));
        mObat.add(new Obat(8, "Dadap", "Erythrina lithosperma", "Fabaceae", "Sakit panas, Obat gatal, meriang", "Daun", "Ditumbuk di balurkan ke kepala, atau Daun di tumbuk dan diperas dengan air, airnya diminum", "0.1", R.drawable.dadap_1));
        mObat.add(new Obat(9, "Beunying", "Ficus fistulosa Reinw", "Moraceae", "Obat batuk, Obat jantung", "Dibuat tuak batangnya", "Tuaknya diminum", "0.06", R.drawable.beunying_1));

        initRecyclerObat();
    }

    private void initRecyclerObat() {
        Log.d(TAG, "initRecyclerObat: initializing.");

        RecyclerView recyclerObat = (RecyclerView) findViewById(R.id.recycler_obat);
        ObatAdapter mAdapter = new ObatAdapter(this, mObat);
        recyclerObat.setAdapter(mAdapter);
        recyclerObat.setLayoutManager(new LinearLayoutManager(this));
    }
}
