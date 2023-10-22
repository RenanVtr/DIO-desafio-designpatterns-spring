package renan.DIOdesafiodesignpatternsspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto Spring Boot gerado atraves de Spring Initialazr
 * Foram utilizadas as desguintes dependencias:
 *  - Spring Data JPA
 *  - Spring WEB
 *  - H2 DataBase
 *  - OpenFeign
 * 
 * @author RenanGarcia
 * @credits falvojr
*/

@EnableFeignClients
@SpringBootApplication
public class DioDesafioDesignpatternsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioDesafioDesignpatternsSpringApplication.class, args);
	}

}
