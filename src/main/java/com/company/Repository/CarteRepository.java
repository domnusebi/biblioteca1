package com.company.Repository;

import com.company.Model.Carte;
import com.company.Model.Utilizator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class CarteRepository implements IRepository<Carte> {
    private List<Carte> carti;

    public CarteRepository() {
        this.carti = new ArrayList<>();
        ;
    }

    @Override
    public void save(Carte entity) {
        carti.add(entity);
    }

    @Override
    public void delete(Carte entity) {
        carti.remove(entity);
    }

    @Override
    public Carte findById(int id) {
        return null;
    }

    @Override
    public List<Carte> findAll() {
        return this.carti;
    }

    @Override
    public Carte update(Carte oldEntity, Carte newEntity) {
        return null;

    }

    public void imprumuta(Utilizator utilizator, int idCarte) {
        if (idCarte < 0 || idCarte >= carti.size()) {
            System.out.println("Cartea cu ID-ul " + idCarte + " nu exista.");
            return;
        }
        Carte carte = carti.get(idCarte);
        if (!carte.isDisponibil()) {
            System.out.println("Cartea nu este disponibila pentru imprumut.");
            return;
        }
        carte.setDisponibil(false);
        System.out.println("Cartea a fost imprumutata cu succes de utilizatorul " + utilizator.getNume());
    }

    public void returneaza(Utilizator utilizator, int idCarte, LocalDate dataReturnare) {
        if (idCarte < 0 || idCarte >= carti.size()) {
            System.out.println("Cartea cu ID-ul " + idCarte + " nu exista.");
            return;
        }
        Carte carte = carti.get(idCarte);
        carte.setDisponibil(true);
        LocalDate dataImprumut = utilizator.getDataImprumut(carte);
        long zileImprumut = ChronoUnit.DAYS.between(dataImprumut, dataReturnare);
        if (zileImprumut > 14) {
            System.out.println("Returnare intarziata. Penalizare aplicata.");
        } else {
            System.out.println("Cartea a fost returnata la timp.");
        }
    }
}
