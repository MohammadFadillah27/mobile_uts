package com.example.aplikasi_uts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class kunci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kata_kunci);
        getSupportActionBar().setTitle("Kata Kunci");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}