package gestaogalinha.br.com.gestaogalinhas.galinha.application.api;

import java.time.LocalDate;
import java.util.UUID;

import gestaogalinha.br.com.gestaogalinhas.galinha.domain.Galinha;
import lombok.Value;

@Value
public class GalinhaDetalhadoResponse {

	private UUID idGalinha;
	private String nome;
	private LocalDate dataNascimento;

	public GalinhaDetalhadoResponse(Galinha galinha) {
		this.idGalinha = galinha.getIdGalinha();
		this.nome = galinha.getNome();
		this.dataNascimento = galinha.getDataNascimento();

	}

}
