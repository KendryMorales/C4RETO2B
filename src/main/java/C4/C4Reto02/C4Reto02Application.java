package C4.C4Reto02;

import C4.C4Reto02.CrudRepository.UserCrudRepository;
import C4.C4Reto02.CrudRepository.SupplementCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C4Reto02Application implements CommandLineRunner {

    @Autowired
    private SupplementCrudRepository supplementCrudRepository;
    @Autowired
    public UserCrudRepository userCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(C4Reto02Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        supplementCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
    }

}
