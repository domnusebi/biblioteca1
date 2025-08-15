import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CarteService {
    private CarteRepository carteRepository;

    public CarteService() {
        this.carteRepository = new CarteRepository();
    }

    public void imprumuta(Utilizator utilizator, int idCarte) {
        Carte carte = carteRepository.findById(idCarte);
        if (carte != null && carte.isDisponibila()) {
            carte.setDisponibila(false);
            System.out.println("Cartea " + idCarte + " a fost imprumutata de " + utilizator.getNume() + ".");
        } else {
            System.out.println("Cartea " + idCarte + " nu este disponibila");
        }
    }

    public void returneaza(Utilizator utilizator, int idCarte, LocalDate dataReturnare) {
        Carte carte = carteRepository.findById(idCarte);
        if (carte != null) {
            carte.setDisponibila(true);
            LocalDate dataImprumut = dataReturnare.minusDays(14);
            long zileIntarziere = ChronoUnit.DAYS.between(dataImprumut.plusDays(14), dataReturnare);
            if (zileIntarziere > 0) {
                System.out.println("Utilizatorul " + utilizator.getNume() + " a returnat cartea " + idCarte + " cu intarziere");
            } else {
                System.out.println("Cartea " + idCarte + " a fost returnata la timp de " + utilizator.getNume() + ".");
            }
        }
    }
}
