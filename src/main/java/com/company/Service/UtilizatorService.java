package com.company.Service;

import com.company.Model.Utilizator;
import com.company.Repository.IRepository;

public class UtilizatorService {
    private IRepository<Utilizator> utilizatorRepository;

    public UtilizatorService(IRepository<Utilizator> utilizatorRepository) {
        this.utilizatorRepository = utilizatorRepository;
    }

    public void register(Utilizator utilizator) {
        utilizatorRepository.save(utilizator);
    }

    public Utilizator login(String email, String parola) {
        for (Utilizator u : utilizatorRepository.findAll()) {
            if (u.getEmail().equals(email) && u.getParola().equals(parola)) {
                return u;
            }
        }
        return null;
    }
}
