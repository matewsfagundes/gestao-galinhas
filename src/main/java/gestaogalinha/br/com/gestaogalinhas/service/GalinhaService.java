package gestaogalinha.br.com.gestaogalinhas.service;

import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaRequest;
import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaResponse;

public interface GalinhaService {

	GalinhaResponse criaGalinha(GalinhaRequest galinhaRequest);

}
