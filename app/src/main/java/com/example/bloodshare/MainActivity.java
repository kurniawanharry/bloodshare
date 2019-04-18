package com.example.bloodshare;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
Tanggal : 18-April-2019
Nama    : Harry Kurniawan
Nim     : 10116408
Kelas   : AKB-9 / IF-9
 */

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent homeintent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(homeintent);
                finish();
            }
        }, SPLASH_TIME_OUT);


    }
}
