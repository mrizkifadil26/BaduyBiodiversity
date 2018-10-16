package com.example.mrizkifadil26.bioapp.activities;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mrizkifadil26.bioapp.R;

public class JamurDetailActivity extends AppCompatActivity {

    private static final String TAG = "JamurDetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG, "onCreate: started.");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamur_detail);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar_jamur);
        setSupportActionBar(mToolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Log.d(TAG, "getIncomingIntent: checking intent.");

        String namaLokal = getIntent().getStringExtra("namaLokal");
        String namaIlmiah = getIntent().getStringExtra("namaIlmiah");
        String famili = getIntent().getStringExtra("famili");
        String lokasi = getIntent().getStringExtra("lokasi");
        String manfaat = getIntent().getStringExtra("manfaat");
        String uv = getIntent().getStringExtra("uv");
        int gambar = getIntent().getIntExtra("gambarJamur", 0);

        ImageView mImageView = (ImageView) findViewById(R.id.headerJamur);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_jamur_collapse);
        TextView mNamaIlmiah = (TextView) findViewById(R.id.detail_jamur_ilmiah);
        TextView mFamili = (TextView) findViewById(R.id.detail_famili);
        TextView mLokasi = (TextView) findViewById(R.id.detail_lokasi);
        TextView mManfaat = (TextView) findViewById(R.id.detail_manfaat);
        Button mUvButton = (Button) findViewById(R.id.detail_uv);

        mImageView.setImageResource(gambar);
        collapsingToolbarLayout.setTitle(namaLokal);
        mNamaIlmiah.setText(namaIlmiah);
        mFamili.setText(famili);
        mLokasi.setText(lokasi);
        mManfaat.setText(manfaat);
        mUvButton.setText(uv);

    }
}
