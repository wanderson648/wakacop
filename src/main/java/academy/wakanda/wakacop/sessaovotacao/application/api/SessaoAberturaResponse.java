package academy.wakanda.wakacop.sessaovotacao.application.api;

import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.Getter;

import java.util.UUID;

@Getter
public class SessaoAberturaResponse {
    UUID idSessao;
    public SessaoAberturaResponse(SessaoVotacao sessaoVotacao) {
        this.idSessao = sessaoVotacao.getId();
    }
}
