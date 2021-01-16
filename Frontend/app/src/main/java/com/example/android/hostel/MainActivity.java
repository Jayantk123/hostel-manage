package com.example.android.hostel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


  final Intent mainToOption = new Intent(MainActivity.this,optionActivity.class);
        Thread thread = new Thread() {
            public void run() {
                try {

                    sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(mainToOption);
                }
            }
        };
        thread.start();
    }
}