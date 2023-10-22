package gestaogalinha.br.com.gestaogalinhas.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import gestaogalinha.br.com.gestaogalinhas.galinha.domain.Galinha;
import gestaogalinha.br.com.gestaogalinhas.handler.APIException;
import gestaogalinha.br.com.gestaogalinhas.repository.GalinhaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class GalinhaInfraRepository implements GalinhaRepository {

	private final GalinhaSpringDataJPArepository galinhaSpringDataJPArepository;

	@Override
	public Galinha salva(Galinha galinha) {
		log.info("[inicia] GalinhaInfraRepository - salva");
		galinhaSpringDataJPArepository.save(galinha);
		log.info("[finaliza] GalinhaInfraRepository - salva");
		return galinha;
	}

	@Override
	public List<Galinha> buscaTodasGalinhas() {
		log.info("[inicia] GalinhaInfraRepository - buscaTodasGalinhas");
		List<Galinha> todasGalinhas = galinhaSpringDataJPArepository.findAll();
		log.info("[finaliza] GalinhaInfraRepository - buscaTodasGalinhas");
		return todasGalinhas;
	}

	@Override
	public Galinha buscaGalinhaAtravesId(UUID idGalinha) {
		log.info("[inicia] GalinhaInfraRepository - buscaGalinhaAtravesId");
		Galinha galinha = galinhaSpringDataJPArepository.findById(idGalinha).orElseThrow(()->
		APIException.build(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
		log.info("[finaliza] ClienteInfraRepository - buscaClienteAtravesId");
		return galinha;
	}

	@Override
	public void deletaGalinhaAtravesId(Galinha galinha) {
		log.info("[inicia] GalinhaInfraRepository - deletaGalinhaAtravesId");
		galinhaSpringDataJPArepository.delete(galinha);
		log.info("[finaliza] GalinhaInfraRepository - deletaGalinhaAtravesId");	
	}

}
