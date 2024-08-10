package projeto.api.publico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages="br.com.projeto.api.model")
@ComponentScan(basePackages= {"projeto.*"})
@EnableJpaRepositories(basePackages= {"br.com.projeto.api.repository"})
@EnableTransactionManagement
@EnableWebMvc
public class ProjetoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoapiApplication.class, args);
	}

}
