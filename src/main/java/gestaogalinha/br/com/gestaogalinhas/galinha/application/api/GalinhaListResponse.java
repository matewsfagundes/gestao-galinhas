package gestaogalinha.br.com.gestaogalinhas.galinha.application.api;

import java.time.LocalDate;

import lombok.Value;
@Value
public class GalinhaListResponse {
	private String nome;
	private LocalDate dataNascimento;

}
