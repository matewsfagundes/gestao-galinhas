package gestaogalinha.br.com.gestaogalinhas.galinha.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class GalinhaResponse {
	private UUID idCliente;

}
