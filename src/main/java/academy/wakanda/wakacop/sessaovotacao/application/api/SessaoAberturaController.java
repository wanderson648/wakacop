package academy.wakanda.wakacop.sessaovotacao.application.api;

import academy.wakanda.wakacop.sessaovotacao.application.service.SessaoVotacaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class SessaoAberturaController implements SessaoVotacaoAPI {
    private final SessaoVotacaoService sessaoAberturaService;
    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[start] SessaoAberturaController - abreSessao");
        SessaoAberturaResponse sessaoAberturaResponse  = sessaoAberturaService.abreSessao(sessaoAberturaRequest);
        log.info("[finish] SessaoAberturaController - abreSessao");
        return sessaoAberturaResponse;
    }
}
