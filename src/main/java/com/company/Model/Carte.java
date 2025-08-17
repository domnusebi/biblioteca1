package com.company.Model;

public class Carte {
    private String titlu;
    private String autor;
    private boolean disponibila;

    public Carte(String titlu, String autor, boolean disponibila) {
        this.titlu = titlu;
        this.autor = autor;
        this.disponibila = disponibila;
    }

    public void setTitlu(String titlu)
    {
        this.titlu = titlu;
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    public void setDisponibila(boolean disponibila)
    {
        this.disponibila = disponibila;
    }

    public String getTitlu()
    {
        return titlu;
    }
    public String getAutor()
    {
        return autor;
    }
    public boolean isDisponibila()
    {
        return disponibila;
    }

    @Override
    public String toString() {
        return "Carte: " + titlu + " Autor: " + autor +
                " Disponibilă: " + (disponibila ? "Da" : "Nu");
    }

    public void setDisponibil(boolean b) {
        this.disponibila = b;
    }

    public boolean isDisponibil() {
        return this.disponibila;
    }
}
