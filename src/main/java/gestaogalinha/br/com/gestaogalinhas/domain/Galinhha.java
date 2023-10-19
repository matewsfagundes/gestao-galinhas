package gestaogalinha.br.com.gestaogalinhas.domain;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Galinhha {
	@Id
	private UUID idCliente;
	@NotBlank
	private String nome;
	@NotNull
	private LocalDate dataNascimento;

	private Galinhha(UUID idCliente, @NotBlank String nome, @NotNull LocalDate dataNascimento) {
		this.idCliente = UUID.randomUUID();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

}
