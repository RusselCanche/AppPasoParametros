package com.example.apppasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.apppasoparametros.modelo.Libro;
import com.example.apppasoparametros.modelo.LibroP;

import java.util.ArrayList;

public class ArrayParceableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_parceable);
        ArrayList<LibroP> libros = (ArrayList<LibroP> ) getIntent().getSerializableExtra("libros");
        System.out.println(libros);
        Toast.makeText(this, libros.toString(), Toast.LENGTH_LONG).show();
    }
}