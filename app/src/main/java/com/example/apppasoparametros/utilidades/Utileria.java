package com.example.apppasoparametros.utilidades;

import android.content.Context;

import com.example.apppasoparametros.modelo.LibroParcelable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Utileria {
    public static List<String> getBooksLines(Context context){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(context.getAssets().open("main.txt")));){
            List<String> lines = new ArrayList<>();
            for(String line= reader.readLine(); line!=null; line=reader.readLine()){
                lines.add(line);
            }
            return lines;
        }catch(Exception e){
            return null;
        }
    }
    public static List<LibroParcelable> getParcelableBooks(List<String> lines){
        List<LibroParcelable> libros = new ArrayList<>();
        for(String line : lines){
            String[] e=line.split(",");
            LibroParcelable lp = new LibroParcelable();
            lp.setIsbn(e[0]);
            lp.setTitulo(e[1]);
            lp.setAutor(e[2]);
            lp.setEditorial(e[3]);
            lp.setEdicion(e[4]);
            lp.setIdioma(e[5]);
            libros.add(lp);
        }
        return libros;
    }
}
