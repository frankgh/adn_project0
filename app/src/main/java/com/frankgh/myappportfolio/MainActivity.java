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

        final String snackbarText = getResources().getString(R.string.snackbar_text);
        final Button spotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamerButton);
        final Button scoresAppButton = (Button) findViewById(R.id.scoresAppButton);
        final Button libraryAppButton = (Button) findViewById(R.id.libraryAppButton);
        final Button buildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        final Button xyzReaderButton = (Button) findViewById(R.id.xyzReaderButton);
        final Button capstoneButton = (Button) findViewById(R.id.capstoneButton);

        View.OnClickListener actionButtonListener = new View.OnClickListener() {
            public void onClick(View view) {
                int messageId = 0;

                if (view == spotifyStreamerButton) {
                    messageId = R.string.spotify_streamer_launch_message;
                } else if (view == scoresAppButton) {
                    messageId = R.string.scores_app_launch_message;
                } else if (view == libraryAppButton) {
                    messageId = R.string.library_app_launch_message;
                } else if (view == buildItBiggerButton) {
                    messageId = R.string.build_it_bigger_launch_message;
                } else if (view == xyzReaderButton) {
                    messageId = R.string.xyz_reader_launch_message;
                } else {
                    messageId = R.string.capstone_launch_message;
                }

                showSnackbar(view, messageId, snackbarText);
            }
        };

        spotifyStreamerButton.setOnClickListener(actionButtonListener);
        scoresAppButton.setOnClickListener(actionButtonListener);
        libraryAppButton.setOnClickListener(actionButtonListener);
        buildItBiggerButton.setOnClickListener(actionButtonListener);
        xyzReaderButton.setOnClickListener(actionButtonListener);
        capstoneButton.setOnClickListener(actionButtonListener);

    }

    private void showSnackbar(final View view, final int messageId, final String snackbarText) {
        Snackbar.make(view, getResources().getString(messageId), Snackbar.LENGTH_LONG)
                .setAction(snackbarText, null).show();
    }

}
