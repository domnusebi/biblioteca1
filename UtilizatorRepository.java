import java.util.ArrayList;
import java.util.List;
public class UtilizatorRepository implements Repository<Utilizator> {
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
}
