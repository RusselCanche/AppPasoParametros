package com.example.apppasoparametros.modelo;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Estante implements Parcelable {
    private List<LibroParcelable> libros;

    public Estante(){
        libros = new ArrayList<>();
    }
    protected Estante(Parcel in) {
        libros = in.createTypedArrayList(LibroParcelable.CREATOR);
    }

    public static final Creator<Estante> CREATOR = new Creator<Estante>() {
        @Override
        public Estante createFromParcel(Parcel in) {
            return new Estante(in);
        }

        @Override
        public Estante[] newArray(int size) {
            return new Estante[size];
        }
    };

    public boolean isEmpty() {
        return libros.isEmpty();
    }
    public void agregar(LibroParcelable libro){
        libros.add(libro);
    }

    public void addAll(List<LibroParcelable> librosR){
        libros.addAll(0, librosR);
    }
    public boolean contains(String isbn){
        LibroParcelable libro = new LibroParcelable();
        libro.setIsbn(isbn);
        return libros.contains(libro);
    }
    public int indexOf(String isbn){
        LibroParcelable libro = new LibroParcelable();
        libro.setIsbn(isbn);
        return libros.indexOf(libro);
    }
    public LibroParcelable get(int iPosition){
        return libros.get(iPosition);
    }
    public void remove(String isbn){
        LibroParcelable libro = new LibroParcelable();
        libro.setIsbn(isbn);
        libros.remove(libro);
    }
    public List<LibroParcelable> getLibros(){
        List<LibroParcelable> listaLibro = new ArrayList<LibroParcelable>();
        listaLibro.addAll(libros);
        return listaLibro;
    }
    public void modify(LibroParcelable libro, int pos){
        libros.set(pos, libro);
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeTypedList(libros);
    }
}
