package com.example.apppasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apppasoparametros.modelo.LibroParcelable;
import com.google.android.material.textfield.TextInputEditText;

public class InfoLibroActivity extends AppCompatActivity {
    private LibroParcelable libroSeleccionado;
    private TextView isbn;
    private TextView titulo;
    private TextView autor;
    private TextView editorial;
    private TextView edicion;
    private TextView idioma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_libro);
        libroSeleccionado = getIntent().getParcelableExtra("libroSeleccionado");

        isbn = findViewById(R.id.isbn);
        titulo = findViewById(R.id.titulo);
        autor = findViewById(R.id.autor);
        editorial = findViewById(R.id.editorial);
        edicion = findViewById(R.id.edicion);
        idioma = findViewById(R.id.idioma);

        isbn.setText(libroSeleccionado.getIsbn());
        titulo.setText(libroSeleccionado.getTitulo());
        autor.setText(libroSeleccionado.getAutor());
        editorial.setText(libroSeleccionado.getEditorial());
        edicion.setText(libroSeleccionado.getEdicion());
        idioma.setText(libroSeleccionado.getIdioma());
    }
}