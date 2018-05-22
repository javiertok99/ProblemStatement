package com.example.a16022934.problemstatement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    Button btnShow;
    ListView lv;
    ArrayList<Song> alSongs;
    ListAdapter la;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        btnShow = findViewById(R.id.btnShowFive);
        lv = findViewById(R.id.lv);
        alSongs = new ArrayList<>();
        DBHelper dbh = new DBHelper(this);
        alSongs.clear();
        alSongs.addAll(dbh.getAllSong());
        dbh.close();



        la = new ListAdapter(this, R.layout.item_row, alSongs);

        lv.setAdapter(la);
        la.notifyDataSetChanged();
    }
}
