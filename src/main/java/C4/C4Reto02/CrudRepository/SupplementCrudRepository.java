package C4.C4Reto02.CrudRepository;

import C4.C4Reto02.Model.Supplement;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author KENDRY
 */
public interface SupplementCrudRepository extends MongoRepository<Supplement, String> {
    
}
