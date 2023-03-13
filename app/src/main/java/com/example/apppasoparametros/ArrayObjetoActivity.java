package com.example.apppasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.apppasoparametros.modelo.Libro;

import java.util.ArrayList;

public class ArrayObjetoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_objeto);
        ArrayList<Libro> libros = (ArrayList<Libro> ) getIntent().getSerializableExtra("libros");
        Toast.makeText(this, libros.toString(), Toast.LENGTH_LONG).show();
    }
}