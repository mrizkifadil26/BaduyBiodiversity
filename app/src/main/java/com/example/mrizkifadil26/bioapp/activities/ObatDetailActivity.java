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

public class ObatDetailActivity extends AppCompatActivity {

    private static final String TAG = "ObatDetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG, "onCreate: started.");
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat_detail);
        
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_obat);
        setSupportActionBar(toolbar);

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
        String penyakit = getIntent().getStringExtra("penyakit");
        String bagianTanaman = getIntent().getStringExtra("bagianTanaman");
        String caraPenggunaan = getIntent().getStringExtra("caraPenggunaan");
        String uv = getIntent().getStringExtra("uv");
        int gambar = getIntent().getIntExtra("gambarObat", 0);

        ImageView mImageView = (ImageView) findViewById(R.id.headerObat);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        TextView mNamaIlmiah = (TextView) findViewById(R.id.ilmiahText);
        TextView mFamili = (TextView) findViewById(R.id.familiText);
        TextView mPenyakit = (TextView) findViewById(R.id.penyakitText);
        TextView mBagian = (TextView) findViewById(R.id.bagianText);
        TextView mCaraPenggunaan = (TextView) findViewById(R.id.caraPenggunaanText);
        Button mUvButton = (Button) findViewById(R.id.uvbutton);

        mImageView.setImageResource(gambar);
        collapsingToolbarLayout.setTitle(namaLokal);
        mNamaIlmiah.setText(namaIlmiah);
        mFamili.setText(famili);
        mPenyakit.setText(penyakit);
        mBagian.setText(bagianTanaman);
        mCaraPenggunaan.setText(caraPenggunaan);
        mUvButton.setText(uv);

    }
}
