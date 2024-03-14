package academy.wakanda.wakacop.sessaovotacao.application.service;

import academy.wakanda.wakacop.pauta.application.service.PautaService;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import academy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;
import academy.wakanda.wakacop.sessaovotacao.application.repository.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {

    private final SessaoVotacaoRepository sessaoAberturaRepository;
    private final PautaService pautaService;
    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[start] SessaoAberturaApplicationService - abreSessao");
        Pauta pauta = pautaService.buscaPautaPorId(sessaoAberturaRequest.getIdPauta());
        SessaoVotacao sessaoVotacao = sessaoAberturaRepository.salvaSessao(new SessaoVotacao(sessaoAberturaRequest, pauta));
        log.info("[finish] SessaoAberturaApplicationService - abreSessao");
        return new SessaoAberturaResponse(sessaoVotacao);
    }
}
