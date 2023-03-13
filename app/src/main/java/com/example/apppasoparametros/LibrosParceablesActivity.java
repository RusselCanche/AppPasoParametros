package com.example.apppasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.apppasoparametros.modelo.Estante;
import com.example.apppasoparametros.modelo.LibroParcelable;

import java.util.ArrayList;

public class LibrosParceablesActivity extends AppCompatActivity {

    private ListView libros;
    private ArrayList<String> titulos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros_parceables);

        Estante estante = getIntent().getParcelableExtra("estante");
        libros = findViewById(R.id.listaLibros);
        titulos = new ArrayList<>();
        for (LibroParcelable libro: estante.getLibros()) {
            titulos.add(libro.getTitulo());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, titulos);
        libros.setAdapter(adapter);

        libros.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                LibroParcelable libroSeleccionado = new LibroParcelable();
                libroSeleccionado = estante.get(i);
                Intent intent = new Intent(getApplicationContext(), InfoLibroActivity.class);
                intent.putExtra("libroSeleccionado", libroSeleccionado);
                startActivity(intent);
            }
        });
    }
}