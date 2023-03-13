package com.example.apppasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class NumerosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        float flotante = getIntent().getFloatExtra("flotante", 0);
        double valor_double = getIntent().getDoubleExtra("valor_double", 0.0);
        int entero = getIntent().getIntExtra("entero", 0);
        Toast.makeText(this, "Float:"+flotante+"\nDouble:"+valor_double+"\nInt:"+entero, Toast.LENGTH_LONG).show();
    }
}