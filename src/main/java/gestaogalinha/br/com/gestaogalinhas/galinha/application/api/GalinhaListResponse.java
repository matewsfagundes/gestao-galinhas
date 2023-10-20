package gestaogalinha.br.com.gestaogalinhas.galinha.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import gestaogalinha.br.com.gestaogalinhas.galinha.domain.Galinha;
import lombok.Value;

@Value
public class GalinhaListResponse {
	private String nome;
	private LocalDate dataNascimento;

	public static List<GalinhaListResponse> converte(List<Galinha> galinhas) {
		return galinhas.stream().map(GalinhaListResponse::new).collect(Collectors.toList());
	}

	private GalinhaListResponse(Galinha galinha) {
		super();
		this.nome = galinha.getNome();
		this.dataNascimento = galinha.getDataNascimento();
	}

}
