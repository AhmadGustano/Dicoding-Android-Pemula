package com.example.ti2019dpc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class TeamDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Team team = intent.getParcelableExtra("TEAM");
        setContentView(R.layout.team_detail);
        String name = team.getName();
        String from = team.getDescription();;
        String photo = team.getLogo();
        ImageView image = findViewById(R.id.item_logo2);
        Glide.with(this)
                .load(photo)
                .into(image);
        TextView text1 = findViewById(R.id.item_name2);
        text1.setText(name);
        TextView text2 = findViewById(R.id.item_desc2);
        text2.setText(from);
    }
    @Override
    public void onBackPressed() {
        Intent back=new Intent(TeamDetail.this,MainActivity.class);
        startActivity(back);
        finish();
    }
}
