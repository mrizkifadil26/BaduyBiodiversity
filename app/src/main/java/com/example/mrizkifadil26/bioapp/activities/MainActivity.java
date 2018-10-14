package com.example.mrizkifadil26.bioapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

import com.example.mrizkifadil26.bioapp.R;

public class MainActivity extends AppCompatActivity {

    CardView mCardView;
    Intent mIntent;
    LinearLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLayout = (LinearLayout) findViewById(R.id.layout_main);
        mCardView = (CardView) findViewById(R.id.panganCard);
        mIntent = new Intent(this, PanganList.class);

        mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mIntent);
            }
        });
    }
}
