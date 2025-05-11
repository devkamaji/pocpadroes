package br.com.ganogsi.pocpadroes.controllers;

import br.com.ganogsi.pocpadroes.controllers.dto.request.RequestPocPadroes;
import br.com.ganogsi.pocpadroes.controllers.dto.response.ResponsePocPadroes;
import br.com.ganogsi.pocpadroes.usecases.UseCaseBuscarInformacoes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor // Lombok gera o construtor
public class ControllerPocPadroes {

    // Nao utilizar @Autowired
    // utilize o construtor para injetar as dependencias
    // @Autowired
    // private ServicePocPadroes servicePocPadroes;

    private final UseCaseBuscarInformacoes useCaseBuscarInformacoes;

    @GetMapping("/buscar#usecases#dynamo")
    public ResponseEntity<List<ResponsePocPadroes>> buscarTudo() {

        final var pocPadroes = useCaseBuscarInformacoes.buscarTudo();

        return ResponseEntity.ok(pocPadroes);
    }

    @PostMapping("/salvar#usecases#dynamo#sqs")
    public ResponseEntity<ResponsePocPadroes> salvar(@RequestBody RequestPocPadroes requestPocPadroes) {

        // Aqui você pode implementar a lógica de salvar no DynamoDB
        // Por exemplo, usando o AWS SDK para Java para interagir com o DynamoDB

        return ResponseEntity.ok(responsePocPadroes);
    }
}
