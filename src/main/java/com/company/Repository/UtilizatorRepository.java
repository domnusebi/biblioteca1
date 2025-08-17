package com.company.Repository;

import com.company.Model.Utilizator;

import java.util.ArrayList;
import java.util.List;
public class UtilizatorRepository implements IRepository<Utilizator> {
    private List<Utilizator> utilizatori;

    public UtilizatorRepository() {
        this.utilizatori = new ArrayList<>();
    }

    @Override
    public void save(Utilizator entity) {
        utilizatori.add(entity);
    }

    @Override
    public void delete(Utilizator entity) {
        utilizatori.remove(entity);
    }

    @Override
    public Utilizator findById(int id) {
        return null;
    }

    @Override
    public List<Utilizator> findAll() {
        return this.utilizatori;
    }

    @Override
    public Utilizator update(Utilizator oldEntity, Utilizator newEntity) {
        return null;
    }

    public void register(Utilizator utilizator) {
        // Verifică dacă există deja un utilizator cu același email
        for (Utilizator u : utilizatori) {
            if (u.getEmail().equals(utilizator.getEmail())) {
                // Există deja un utilizator cu acest email
                return;
            }
        }
        utilizatori.add(utilizator);
    }

    public Utilizator login(String email, String parola) {
        for (Utilizator u : utilizatori) {
            if (u.getEmail().equals(email) && u.getParola().equals(parola)) {
                return u;
            }
        }
        return null;
    }
}