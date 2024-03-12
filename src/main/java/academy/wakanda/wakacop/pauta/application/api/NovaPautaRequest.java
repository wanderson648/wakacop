package academy.wakanda.wakacop.pauta.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.UUID;

@Getter
public class NovaPautaRequest {
    @NotBlank
    String titulo;
    @NotBlank
    String descricao;
    @NotNull
    UUID idAssociadoAutor;
}
