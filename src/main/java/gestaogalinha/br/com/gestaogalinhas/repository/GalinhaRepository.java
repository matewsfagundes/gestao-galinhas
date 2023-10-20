package gestaogalinha.br.com.gestaogalinhas.repository;

import java.util.List;

import gestaogalinha.br.com.gestaogalinhas.galinha.domain.Galinha;

public interface GalinhaRepository {

	Galinha salva(Galinha galinha);

	List<Galinha> buscaTodasGalinhas();

}
