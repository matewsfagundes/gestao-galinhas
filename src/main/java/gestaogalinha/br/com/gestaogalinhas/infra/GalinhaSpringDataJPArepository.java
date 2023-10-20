package gestaogalinha.br.com.gestaogalinhas.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import gestaogalinha.br.com.gestaogalinhas.galinha.domain.Galinha;

public interface GalinhaSpringDataJPArepository extends JpaRepository <Galinha, UUID>{

}
