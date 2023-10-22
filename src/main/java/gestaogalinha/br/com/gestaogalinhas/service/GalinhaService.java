package gestaogalinha.br.com.gestaogalinhas.service;

import java.util.List;
import java.util.UUID;

import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaDetalhadoResponse;
import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaListResponse;
import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaRequest;
import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaResponse;

public interface GalinhaService {

	GalinhaResponse criaGalinha(GalinhaRequest galinhaRequest);
	List<GalinhaListResponse> buscaTodasGalinhas();
	GalinhaDetalhadoResponse buscaGalinhaAtravesId(UUID idGalinha);
	void deletaGalinhaAtravesId(UUID idGalinha);

}
