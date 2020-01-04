package com.example.ti2019dpc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView RVData;
    private ArrayList<Team> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RVData = findViewById(R.id.team_data);
        RVData.setHasFixedSize(true);

        list.addAll(TeamData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        RVData.setLayoutManager(new LinearLayoutManager(this));
        ListTeamAdapter listTeamAdapter = new ListTeamAdapter(getApplicationContext(),list);
        RVData.setAdapter(listTeamAdapter);
        listTeamAdapter.setOnItemClickCallback(new ListTeamAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(Team data) {
                showSelectedHero(data);
            }
        });
    }
    private void showSelectedHero(Team team) {
        Toast.makeText(this, "Kamu memilih " + team.getName(), Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent move = new Intent(MainActivity.this,About.class);
                startActivity(move);
                break;
        }
    }
    public void onBackPressed() {
        finish();
    }
}
