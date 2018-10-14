package com.example.mrizkifadil26.bioapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

import com.example.mrizkifadil26.bioapp.R;

public class MainActivity extends AppCompatActivity {

    LinearLayout parentLayout;

    CardView panganCardView;
    Intent panganIntent;

    CardView obatCardView;
    Intent obatIntent;

    CardView tentangCardView;
    Intent tentangIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parentLayout = (LinearLayout) findViewById(R.id.layout_main);
        panganCardView = (CardView) findViewById(R.id.panganCard);
        panganIntent = new Intent(this, PanganList.class);

        panganCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(panganIntent);
            }
        });

        obatCardView = (CardView) findViewById(R.id.obatCard);
        obatIntent = new Intent(this, ObatList.class);

        obatCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(obatIntent);
            }
        });

        tentangCardView = (CardView) findViewById(R.id.tentangCard);
        tentangIntent = new Intent(this, AboutActivity.class);

        tentangCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(tentangIntent);
            }
        });

    }
}
