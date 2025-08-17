package com.company.Model;

import java.time.LocalDate;

public class Utilizator {
    private String nume;
    private String email;
    private String parola;

    public Utilizator(String nume, String email, String parola)
    {
        this.nume = nume;
        this.email = email;
        this. parola = parola;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getNume()
    {
        return nume;
    }
    public String getEmail()
    {
        return email;
    }
    public String getParola()
    {
        return parola;
    }

    @Override
    public String toString() {
        return "Utilizator: " + nume + " Email: " + email;
    }

    public LocalDate getDataImprumut(Carte carte) {
    }
}
