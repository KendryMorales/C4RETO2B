package C4.C4Reto02.Repository;

import C4.C4Reto02.Model.Supplement;
import C4.C4Reto02.CrudRepository.SupplementCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KENDRY
 */
@Repository
public class SupplementRepository {
    @Autowired
    private SupplementCrudRepository repository;

    public List<Supplement> getAll() {
        return repository.findAll();
    }

    public Optional<Supplement> getProduct(String reference) {
        return repository.findById(reference);
    }
    public Supplement create(Supplement product) {
        return repository.save(product);
    }

    public void update(Supplement product) {
        repository.save(product);
    }
    
    public void delete(Supplement product) {
        repository.delete(product);
    }
}