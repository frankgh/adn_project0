package com.frankgh.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void showSnackbar(final View view) {

        final int viewId = view.getId(); // The ID of the button
        int messageId = R.string.wut; // The ID of the message that we want to show

        if (viewId == R.id.spotifyStreamerButton) {
            messageId = R.string.main_activity_spotify_streamer_button;
        } else if (viewId == R.id.scoresAppButton) {
            messageId = R.string.main_activity_scores_app_button;
        } else if (viewId == R.id.libraryAppButton) {
            messageId = R.string.main_activity_library_app_button;
        } else if (viewId == R.id.buildItBiggerButton) {
            messageId = R.string.main_activity_build_it_bigger_button;
        } else if (viewId == R.id.xyzReaderButton) {
            messageId = R.string.main_activity_xyz_reader_button;
        } else if (viewId == R.id.capstoneButton) {
            messageId = R.string.main_activity_capstone_button;
        }

        final String snackbarText = getResources().getString(R.string.snackbar_text);
        String message = String.format(getString(R.string.app_launch_message), getString(messageId));
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).setAction(snackbarText, null).show();
    }

}
