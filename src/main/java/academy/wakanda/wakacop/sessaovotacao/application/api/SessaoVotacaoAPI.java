package academy.wakanda.wakacop.sessaovotacao.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessao/abertura")
public interface SessaoVotacaoAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    SessaoAberturaResponse abreSessao(@Valid @RequestBody SessaoAberturaRequest sessaoAberturaRequest);
}
