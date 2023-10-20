package gestaogalinha.br.com.gestaogalinhas.repository;

import java.util.List;
import java.util.UUID;

import gestaogalinha.br.com.gestaogalinhas.galinha.domain.Galinha;

public interface GalinhaRepository {

	Galinha salva(Galinha galinha);
	List<Galinha> buscaTodasGalinhas();
	Galinha buscaGalinhaAtravesId(UUID idGalinha);
}
