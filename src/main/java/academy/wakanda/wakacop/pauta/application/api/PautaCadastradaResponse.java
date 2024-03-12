package academy.wakanda.wakacop.pauta.application.api;

import academy.wakanda.wakacop.pauta.domain.Pauta;
import lombok.Getter;

import java.util.UUID;

@Getter
public class PautaCadastradaResponse {
    UUID id;
    public PautaCadastradaResponse(Pauta pauta) {
        this.id = pauta.getId();
    }
}
