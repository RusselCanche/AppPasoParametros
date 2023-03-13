package com.example.apppasoparametros.modelo;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LibroParcelable implements Parcelable {
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private String edicion;
    private String idioma;

    public LibroParcelable() {

    }
    public LibroParcelable(Parcel in) {
        isbn = in.readString();
        titulo = in.readString();
        autor = in.readString();
        editorial = in.readString();
        edicion = in.readString();
        idioma = in.readString();
    }

    public static final Creator<LibroParcelable> CREATOR = new Creator<LibroParcelable>() {
        @Override
        public LibroParcelable createFromParcel(Parcel in) {
            return new LibroParcelable(in);
        }

        @Override
        public LibroParcelable[] newArray(int size) {
            return new LibroParcelable[size];
        }
    };

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(isbn);
        parcel.writeString(titulo);
        parcel.writeString(autor);
        parcel.writeString(editorial);
        parcel.writeString(edicion);
        parcel.writeString(idioma);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        LibroParcelable libro = (LibroParcelable) obj;
        return libro.getIsbn().equals(isbn);
    }
}
