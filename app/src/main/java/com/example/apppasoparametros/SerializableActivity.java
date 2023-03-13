package com.example.apppasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.apppasoparametros.modelo.Libro;

public class SerializableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serializable);

        Libro libro = null;
        libro = (Libro) getIntent().getSerializableExtra("libro");
        System.out.println(libro.toString());
        Toast.makeText(this, libro.toString(), Toast.LENGTH_SHORT).show();
    }
}