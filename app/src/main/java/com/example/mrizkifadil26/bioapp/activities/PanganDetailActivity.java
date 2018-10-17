package com.example.mrizkifadil26.bioapp.activities;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.example.mrizkifadil26.bioapp.R;

public class PanganDetailActivity extends AppCompatActivity {

    private static final String TAG = "PanganDetailActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG, "onCreate: started.");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pangan_detail);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        Log.d(TAG, "getIncomingIntent: checking intent.");

        String namaLokal = getIntent().getStringExtra("namaLokal");
        String namaIlmiah = getIntent().getStringExtra("namaIlmiah");
        String famili = getIntent().getStringExtra("famili");
        String fungsiUtama = getIntent().getStringExtra("fungsiUtama");
        String fungsiSamping = getIntent().getStringExtra("fungsiSamping");
        String uv = getIntent().getStringExtra("uv");
        int gambar = getIntent().getIntExtra("gambar", 0);

        ImageView mImageView = (ImageView) findViewById(R.id.header_pangan);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        TextView mNamaIlmiah = (TextView) findViewById(R.id.namaIlmiahText);
        TextView mFamili = (TextView) findViewById(R.id.familiText);
        TextView mFungsiUtama = (TextView) findViewById(R.id.fungsiUtamaText);
        TextView mFungsiSamping = (TextView) findViewById(R.id.fungsiSampingText);
        Button mUvButton = (Button) findViewById(R.id.uvbutton);

        mImageView.setImageResource(gambar);
        collapsingToolbarLayout.setTitle(namaLokal);
        mNamaIlmiah.setText(namaIlmiah);
        mFamili.setText(famili);
        mFungsiUtama.setText(fungsiUtama);
        mFungsiSamping.setText(fungsiSamping);
        mUvButton.setText(uv);

    }
}