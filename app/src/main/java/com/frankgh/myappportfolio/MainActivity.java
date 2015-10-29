package com.frankgh.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bindClickListeners();
    }

    private void bindClickListeners() {

        final String snackBarText = getResources().getString(R.string.snackbar_text);

        final Button spotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamerButton);
        spotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Snackbar.make(view, getResources().getString(R.string.spotify_streamer_launch_message),
                        Snackbar.LENGTH_LONG).setAction(snackBarText, null).show();
            }
        });

        final Button scoresAppButton = (Button) findViewById(R.id.scoresAppButton);
        scoresAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Snackbar.make(view, getResources().getString(R.string.scores_app_launch_message),
                        Snackbar.LENGTH_LONG).setAction(snackBarText, null).show();
            }
        });

        final Button libraryAppButton = (Button) findViewById(R.id.libraryAppButton);
        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Snackbar.make(view, getResources().getString(R.string.library_app_launch_message),
                        Snackbar.LENGTH_LONG).setAction(snackBarText, null).show();
            }
        });

        final Button buildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Snackbar.make(view, getResources().getString(R.string.build_it_bigger_launch_message),
                        Snackbar.LENGTH_LONG).setAction(snackBarText, null).show();
            }
        });

        final Button xyzReaderButton = (Button) findViewById(R.id.xyzReaderButton);
        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Snackbar.make(view, getResources().getString(R.string.xyz_reader_launch_message),
                        Snackbar.LENGTH_LONG).setAction(snackBarText, null).show();
            }
        });

        final Button capstoneButton = (Button) findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Snackbar.make(view, getResources().getString(R.string.capstone_launch_message),
                        Snackbar.LENGTH_LONG).setAction(snackBarText, null).show();
            }
        });

    }
}
