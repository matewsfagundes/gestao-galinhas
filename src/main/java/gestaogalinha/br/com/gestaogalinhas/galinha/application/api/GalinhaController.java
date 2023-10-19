package gestaogalinha.br.com.gestaogalinhas.galinha.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class GalinhaController implements GalinhaAPI {

	@Override
	public GalinhaResponse postGalinha(GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaResponse - postGalinha");
		log.info("[finaliza] GalinhaResponse - postGalinha");
		return null;
	}

}
