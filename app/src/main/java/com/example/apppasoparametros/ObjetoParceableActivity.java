package com.example.apppasoparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.Toast;

import org.parceler.Parcels;
import com.example.apppasoparametros.modelo.Libro;
import com.example.apppasoparametros.modelo.LibroP;

public class ObjetoParceableActivity extends AppCompatActivity {
    private static final String TAG = "ObjetoParceableActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objeto_parceable);

        LibroP libro = null;
        libro = (LibroP) getIntent().getParcelableExtra("libroOP");

        Toast.makeText(this, libro.toString(), Toast.LENGTH_SHORT).show();
    }
}