package com.example.apppasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class CadenasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadenas);
        String nombreCompleto = getIntent().getStringExtra("nombreCompleto");
        Toast.makeText(this, nombreCompleto, Toast.LENGTH_LONG).show();
    }
}