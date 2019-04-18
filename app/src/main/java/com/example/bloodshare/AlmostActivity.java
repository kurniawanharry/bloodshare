package com.example.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);

        Button btnNavAlmost = (Button) findViewById(R.id.btn_almost);

        btnNavAlmost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlmostActivity.this, VerifyActivity.class);
                startActivity(intent);
            }
        });
    }
}
