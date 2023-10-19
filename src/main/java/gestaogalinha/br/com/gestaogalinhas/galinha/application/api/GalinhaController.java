package gestaogalinha.br.com.gestaogalinhas.galinha.application.api;

import org.springframework.web.bind.annotation.RestController;

import gestaogalinha.br.com.gestaogalinhas.service.GalinhaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class GalinhaController implements GalinhaAPI {
	private final GalinhaService galinhaService;

	@Override
	public GalinhaResponse postGalinha(GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaResponse - postGalinha");
		GalinhaResponse galinhaCriada = galinhaService.criaGalinha(galinhaRequest);
		log.info("[finaliza] GalinhaResponse - postGalinha");
		return galinhaCriada;
	}

}
