package com.example.administrator.huanxindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mvp_log.mvp.MvpActivity;


public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent =  new Intent(MainActivity.this, MvpActivity.class);
                startActivity(intent);
            }
        });
    }
}
