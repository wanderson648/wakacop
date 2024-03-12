package academy.wakanda.wakacop.pauta.application.infra;

import academy.wakanda.wakacop.pauta.domain.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
public interface PautaSpringDataJpaRepository extends JpaRepository<Pauta, UUID> {
}
