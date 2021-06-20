package com.example.buttondemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick01 (View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void onClick02(View v){
        Intent intent = new Intent(getApplicationContext(), SubActivity2.class);
        startActivity(intent);
    }

    public void onClick03(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:00"));
        startActivity(intent);
    }
}