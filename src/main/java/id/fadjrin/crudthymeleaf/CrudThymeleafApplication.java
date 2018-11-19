package id.fadjrin.crudthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
/*@EnableAutoConfiguration
@ComponentScan(basePackages = {"id.fadjrin.crudthymeleaf"})
@EnableJpaRepositories(basePackages = {"id.fadjrin.crudthymeleaf.repository"})
@EnableTransactionManagement;*/
@EntityScan(basePackages = {"id.fadjrin.crudthymeleaf.model"})

public class CrudThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudThymeleafApplication.class, args);
    }
}
