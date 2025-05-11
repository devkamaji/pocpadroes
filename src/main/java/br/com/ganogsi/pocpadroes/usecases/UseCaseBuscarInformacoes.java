package br.com.ganogsi.pocpadroes.usecases;

import br.com.ganogsi.pocpadroes.controllers.dto.response.ResponsePocPadroes;
import br.com.ganogsi.pocpadroes.ports.repositories.dynamo.DynamoBusca;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UseCaseBuscarInformacoes {

     private final DynamoBusca dynamoBusca;

     public List<ResponsePocPadroes> buscarTudo() {
         return dynamoBusca.buscarTudo();
     }
}
