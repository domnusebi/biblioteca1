import java.util.ArrayList;
import java.util.List;
public class CarteRepository implements Repository<Carte> {
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


