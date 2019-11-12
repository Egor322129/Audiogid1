package com.example.audiogid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView firstSongClick;
    private TextView secondSongClick;
    private TextView thirdSongClick;
    private TextView lastSongClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        firstSongClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        secondSongClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        thirdSongClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        lastSongClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initViews() {
        firstSongClick = (TextView)findViewById(R.id.firstsong);
        secondSongClick = (TextView)findViewById(R.id.secondsong);
        thirdSongClick = (TextView)findViewById(R.id.thirdsong);
        lastSongClick = (TextView)findViewById(R.id.lastsong);
    }
}
