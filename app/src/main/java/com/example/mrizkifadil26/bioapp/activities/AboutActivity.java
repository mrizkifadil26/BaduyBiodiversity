package com.example.mrizkifadil26.bioapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mrizkifadil26.bioapp.R;

import mehdi.sakout.aboutpage.AboutPage;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.ic_biologo_60)
                .setDescription("Aplikasi ini merupakan aplikasi pengenalan biodiversitas tanaman di Suku Baduy.")
                .addGroup("Connect with Us")
                .addEmail("mrizkifadil26@gmail.com")
                .addGitHub("mrizkifadil26")
                .create();

        setContentView(aboutPage);
    }
}
