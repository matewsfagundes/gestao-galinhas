package gestaogalinha.br.com.gestaogalinhas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class GestaoGalinhasApplication {
	@GetMapping
	public String getHomeTest() {
		return "Gestão de Galinhas - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(GestaoGalinhasApplication.class, args);
	}

}
