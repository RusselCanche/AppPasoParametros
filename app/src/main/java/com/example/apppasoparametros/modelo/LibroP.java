package com.example.apppasoparametros.modelo;

import android.os.Parcel;
import android.os.Parcelable;

public class LibroP implements Parcelable {
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private String edicion;
    private String idioma;

    public LibroP() {
    }

    public LibroP(String isbn, String titulo, String autor, String editorial, String edicion, String idioma) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.idioma = idioma;
    }

    protected LibroP(Parcel in) {
        isbn = in.readString();
        titulo = in.readString();
        autor = in.readString();
        editorial = in.readString();
        edicion = in.readString();
        idioma = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(isbn);
        dest.writeString(titulo);
        dest.writeString(autor);
        dest.writeString(editorial);
        dest.writeString(edicion);
        dest.writeString(idioma);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LibroP> CREATOR = new Creator<LibroP>() {
        @Override
        public LibroP createFromParcel(Parcel in) {
            return new LibroP(in);
        }

        @Override
        public LibroP[] newArray(int size) {
            return new LibroP[size];
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
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", edicion='" + edicion + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}