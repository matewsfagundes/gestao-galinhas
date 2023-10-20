package gestaogalinha.br.com.gestaogalinhas.galinha.application.api;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Value;
@Value
public class GalinhaDetalhadoResponse {
	private UUID idCliente;
	private String nome;
	private LocalDate dataNascimento;

}
