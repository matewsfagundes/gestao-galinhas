package gestaogalinha.br.com.gestaogalinhas.galinha.domain;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import gestaogalinha.br.com.gestaogalinhas.galinha.application.api.GalinhaRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Galinha {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nome;
	@NotNull
	private LocalDate dataNascimento;

	public Galinha(GalinhaRequest galinhaRequest) {
		this.nome = galinhaRequest.getNome();
		this.dataNascimento = galinhaRequest.getDataNascimento();
	}

}
