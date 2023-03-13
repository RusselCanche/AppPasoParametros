package com.example.apppasoparametros;

import static com.example.apppasoparametros.utilidades.Utileria.getBooksLines;
import static com.example.apppasoparametros.utilidades.Utileria.getParcelableBooks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.apppasoparametros.modelo.Estante;
import com.example.apppasoparametros.modelo.Libro;
import com.example.apppasoparametros.modelo.LibroP;
import com.example.apppasoparametros.modelo.LibroParcelable;

import org.parceler.Parcels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.op_cadenas:
                String nombreCompleto = "Russel Emanuel Canche Santana";
                intent = new Intent(this, CadenasActivity.class);
                intent.putExtra("nombreCompleto", nombreCompleto);
                break;
            case R.id.op_numeros:
                float flotante = 1.0f;
                double valor_double = 2.0;
                int entero = 3;
                intent = new Intent(this, NumerosActivity.class);
                intent.putExtra("flotante", flotante);
                intent.putExtra("valor_double", valor_double);
                intent.putExtra("entero", entero);
                break;
            case R.id.op_arrays_simples:
                String[] arrayStrings = {"hola", "mundo"};
                intent = new Intent(this, ArraySimpleActivity.class);
                intent.putExtra("arrayStrings", arrayStrings);
                break;
            case R.id.op_serializables:
                Libro libro = new Libro();
                libro.setIsbn("1234567");
                libro.setTitulo("Principito");
                libro.setAutor("Russel Emanuel Canche Santana");
                libro.setEditorial("Educacion");
                libro.setEdicion("3");
                libro.setIdioma("Spanish");
                intent = new Intent(this, SerializableActivity.class);
                intent.putExtra("libro", (Serializable) libro);
                break;
            case R.id.op_array_objetos:
                Libro libro2 = new Libro();
                libro2.setIsbn("12345678");
                libro2.setTitulo("El Principito");
                libro2.setAutor("John");
                libro2.setEditorial("Obelisco");
                libro2.setEdicion("Primera");
                libro2.setIdioma("Español");
                Libro libro3 = new Libro();
                libro3.setIsbn("87654321");
                libro3.setTitulo("Naturaleza");
                libro3.setAutor("Flor");
                libro3.setEditorial("Ocean");
                libro3.setEdicion("Segunda");
                libro3.setIdioma("Español");
                ArrayList<Libro> libros = new ArrayList<>();
                libros.add(libro2);
                libros.add(libro3);
                intent = new Intent(this, ArrayObjetoActivity.class);
                intent.putExtra("libros", libros);
                break;
            case R.id.op_objeto_parceleable:
                LibroP libroOP = new LibroP("123", "El sol", "Yo", "Campanita", "3", "Esp");
                intent = new Intent(this, ObjetoParceableActivity.class);
                intent.putExtra("libroOP", libroOP);
                break;
            case R.id.op_arrays_parceleable:
                LibroP libroOP1 = new LibroP("1234", "La luna", "Yo2", "Campos", "1", "Esp");
                LibroP libroOP2 = new LibroP("1235", "El sol", "Yo", "Campanita", "3", "Esp");
                ArrayList<LibroP> librosP = new ArrayList<>();
                librosP.add(libroOP1);
                librosP.add(libroOP2);
                intent = new Intent(this, ArrayParceableActivity.class);
                intent.putExtra("libros", librosP);
                break;
            case R.id.op_librosParcelables:
                List<LibroParcelable> librillos = getParcelableBooks(getBooksLines(getApplicationContext()));
                Estante estante = new Estante();
                estante.addAll(librillos);
                intent = new Intent(this, LibrosParceablesActivity.class);
                intent.putExtra("estante", estante);
                break;
        }
        startActivity(intent);
        return true;
    }

}