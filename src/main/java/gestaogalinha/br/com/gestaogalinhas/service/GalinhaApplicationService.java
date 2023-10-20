package gestaogalinha.br.com.gestaogalinhas.service;

import org.springframework.stereotype.Service;

import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaRequest;
import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaResponse;
import gestaogalinha.br.com.gestaogalinhas.galinha.domain.Galinha;
import gestaogalinha.br.com.gestaogalinhas.repository.GalinhaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class GalinhaApplicationService implements GalinhaService {

	private final GalinhaRepository galinhaRepository;

	@Override
	public GalinhaResponse criaGalinha(GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaApplicationService - criaGalinha");
		Galinha galinha = galinhaRepository.salva(new Galinha(galinhaRequest));
		log.info("[finaliza] GalinhaApplicationService - criaGalinha");
		return GalinhaResponse.builder()
				.idCliente(galinha.getIdCliente())
				.build();
	}

}
