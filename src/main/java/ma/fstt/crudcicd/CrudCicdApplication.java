package ma.fstt.crudcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "ma.fstt.Entity")
@EnableJpaRepositories(basePackages = "ma.fstt.Repo")
@ComponentScan(basePackages = "ma.fstt.Service")
@ComponentScan(basePackages = "ma.fstt.Controller")
public class CrudCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudCicdApplication.class, args);
    }

}
