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
    }

    public void showSnackbar(final View view) {
        if (view instanceof Button) {
            final Button button = (Button) view;
            final String message = String.format(getString(R.string.app_launch_message), button.getText());

            Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                    .setAction(getString(R.string.snackbar_text), null)
                    .show();
        }
    }

}
