package com.example.apppasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ArraySimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_simple);
        String[] arrayStrings = getIntent().getStringArrayExtra("arrayStrings");
        for (String str:arrayStrings) {
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        }
    }
}