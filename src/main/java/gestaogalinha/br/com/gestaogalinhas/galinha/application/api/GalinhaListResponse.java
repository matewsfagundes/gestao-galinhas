package gestaogalinha.br.com.gestaogalinhas.galinha.application.api;

import java.time.LocalDate;
import java.util.List;

import gestaogalinha.br.com.gestaogalinhas.galinha.domain.Galinha;
import lombok.Value;
@Value
public class GalinhaListResponse {
	private String nome;
	private LocalDate dataNascimento;
	
	public static List<GalinhaListResponse> converte(List<Galinha> galinhas) {
		return null;
	}

}
