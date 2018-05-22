package com.example.a16022934.problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter {
    private ArrayList<Song> song;
    private Context context;
    private TextView tvYear, tvTitle, tvSinger;
    private ImageView ivStar1, ivStar2, ivStar3, ivStar4, ivStar5;


    public ListAdapter(Context context, int resource, ArrayList<Song> objects) {
        super(context, resource, objects);
        song = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_row, parent, false);

        String txt = "";

        tvYear = rowView.findViewById(R.id.tvYear);
        tvSinger = rowView.findViewById(R.id.tvSinger);
        tvTitle = rowView.findViewById(R.id.tvTitle);
        ivStar1 = rowView.findViewById(R.id.ivStar1);
        ivStar2 = rowView.findViewById(R.id.ivStar2);
        ivStar3 = rowView.findViewById(R.id.ivStar3);
        ivStar4 = rowView.findViewById(R.id.ivStar4);
        ivStar5 = rowView.findViewById(R.id.ivStar5);
        Song currSong = song.get(position);
        String title = currSong.getTitle();
        String singer = currSong.getSingers();
        int year = currSong.getYear();
        int stars = currSong.getStars();

        tvTitle.setText(title);
        tvYear.setText(year + "");
        tvSinger.setText(singer);
        if (stars == 1) {
            ivStar1.setImageResource(android.R.drawable.btn_star_big_on);
        } else if (stars == 2) {
            ivStar1.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar2.setImageResource(android.R.drawable.btn_star_big_on);
        } else if (stars == 3) {
            ivStar1.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar2.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar3.setImageResource(android.R.drawable.btn_star_big_on);
        } else if (stars == 4) {
            ivStar1.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar2.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar3.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar4.setImageResource(android.R.drawable.btn_star_big_on);
        } else if (stars == 5) {
            ivStar1.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar2.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar3.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar4.setImageResource(android.R.drawable.btn_star_big_on);
            ivStar5.setImageResource(android.R.drawable.btn_star_big_on);
        }


        return rowView;
    }
}
