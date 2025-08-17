package com.company.repository;

import java.util.ArrayList;
import java.util.List;

public class CarteIRepository implements IRepository<Carte> {
    private List<Carte> carti;

    public CarteIRepository() {
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
}


