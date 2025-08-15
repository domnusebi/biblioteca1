public class UtilizatorService {
    private UtilizatorRepository utilizatorRepository;

    public UtilizatorService(UtilizatorRepository utilizatorRepository) {
        this.utilizatorRepository = utilizatorRepository;
    }

    public void register(Utilizator utilizator) {
        for (Utilizator u : utilizatorRepository.findAll()) {
            if (u.getEmail().equals(utilizator.getEmail())) {
                return;
            }
        }
        utilizatorRepository.save(utilizator);
    }

    public Utilizator login(String email, String parola) {
        for (Utilizator u : utilizatorRepository.findAll()) {
            if (u.getEmail().equals(email) && u.getParola().equals(parola)) {
                return u;
            }
        }
    }
}
