package gestaogalinha.br.com.gestaogalinhas.galinha.application.api;

import java.time.LocalDate;
import java.util.UUID;

import gestaogalinha.br.com.gestaogalinhas.galinha.domain.Galinha;
import lombok.Value;

@Value
public class GalinhaDetalhadoResponse {

	private UUID idCliente;
	private String nome;
	private LocalDate dataNascimento;

	public GalinhaDetalhadoResponse(Galinha galinha) {
		this.idCliente = galinha.getIdCliente();
		this.nome = galinha.getNome();
		this.dataNascimento = galinha.getDataNascimento();

	}

}
