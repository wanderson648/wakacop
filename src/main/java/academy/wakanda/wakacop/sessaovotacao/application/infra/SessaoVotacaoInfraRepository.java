package academy.wakanda.wakacop.sessaovotacao.application.infra;

import academy.wakanda.wakacop.sessaovotacao.application.repository.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoInfraRepository implements SessaoVotacaoRepository {

    private final SessaoVotacaoSpringJPARepository sessaoVotacaoSpringJPARepository;

    @Override
    public SessaoVotacao salvaSessao(SessaoVotacao sessaoVotacao) {
        log.info("[start] SessaoAberturaInfraRepository - salvaSessao");
        sessaoVotacaoSpringJPARepository.save(sessaoVotacao);
        log.info("[start] SessaoAberturaInfraRepository - salvaSessao");
        return sessaoVotacao;
    }
}
