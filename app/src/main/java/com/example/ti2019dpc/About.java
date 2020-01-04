package com.example.ti2019dpc;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_about);
    }

    @Override
    public void onBackPressed() {
        Intent back=new Intent(About.this,MainActivity.class);
        startActivity(back);
        finish();
    }
}
