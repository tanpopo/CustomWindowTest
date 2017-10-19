package com.example.mrk.customwindowtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import static android.view.View.IMPORTANT_FOR_AUTOFILL_AUTO;

/**
 * Created by mariko on 2017/10/20.
 */

public class CustomViewActivity extends AppCompatActivity {
    private static String TAG = "CustomViewTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_view_activity);

        CustomView customView = (CustomView)findViewById(R.id.view_text_and_button);
        customView.setImportantForAutofill(IMPORTANT_FOR_AUTOFILL_AUTO);

        Button loginButton = (Button)findViewById(R.id.button_login);
        loginButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                login();
            }
        });
    }

    @Override
    protected  void onStart() {
        super.onStart();

        Log.d(TAG, "CustomViewActivityOld::onStart()");
    }

    @Override
    protected  void onResume() {
        super.onResume();

        Log.d(TAG, "CustomViewActivityOld::onResume()");
    }

    private void login() {
        finish();
    }
}
