import com.company.Model.Carte;
import com.company.Model.Utilizator;

public class Main {
    public static void main(String[] args) {

        Carte carte1 = new Carte("Ion", "Liviu Rebreanu", true);
        Carte carte2 = new Carte("Engima Otiliei", "George Enescu", false);

        String nume = new String("Dragos");
        String email = new String("dragos1@gmail.com");
        String parola = new String("1234");
        Utilizator utilizator1 = new Utilizator(nume, email, parola);

        System.out.println(carte1);
        System.out.println(utilizator1);
    }
}