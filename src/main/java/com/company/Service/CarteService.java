package com.company.Service;

import com.company.Model.Carte;
import com.company.Model.Utilizator;
import com.company.Repository.JdbcCarteRepository;

import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CarteService {
    private JdbcCarteRepository carteRepository;

    public CarteService(JdbcCarteRepository carteRepository) {
        this.carteRepository = carteRepository;
    }

    public void imprumuta(Utilizator utilizator, int idCarte) {
        carteRepository.imprumuta(utilizator, idCarte);
    }

    public void returneaza(Utilizator utilizator, int idCarte, LocalDate dataReturnare) {
        carteRepository.returneaza(utilizator, idCarte, dataReturnare);
    }

}
