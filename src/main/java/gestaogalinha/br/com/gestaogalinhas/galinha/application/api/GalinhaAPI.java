package gestaogalinha.br.com.gestaogalinhas.galinha.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/galinha")
public interface GalinhaAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	GalinhaResponse postGalinha(@Valid @RequestBody GalinhaRequest galinhaRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<GalinhaListResponse> getTodasGalinhas();
}
