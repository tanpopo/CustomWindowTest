package com.example.mrk.customwindowtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button_custom_window);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CustomViewActivity.class));
            }
        });
    }
}

