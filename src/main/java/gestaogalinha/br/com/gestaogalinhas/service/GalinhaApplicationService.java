package gestaogalinha.br.com.gestaogalinhas.service;

import org.springframework.stereotype.Service;

import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaRequest;
import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaResponse;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
public class GalinhaApplicationService implements GalinhaService {

	@Override
	public GalinhaResponse criaGalinha(GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaApplicationService - criaGalinha");
		log.info("[finaliza] GalinhaApplicationService - criaGalinha");
		return null;
	}

}
