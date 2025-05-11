package br.com.ganogsi.pocpadroes.usecases;

import br.com.ganogsi.pocpadroes.ports.producers.sqs.SqsEnvioMensagem;
import br.com.ganogsi.pocpadroes.ports.repositories.redis.RedisInsercao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UseCaseTratarEnvio {

    private final RedisInsercao redisInsercao;
    private final SqsEnvioMensagem sqsEnvioMensagem;

    public void tratarEnvio(String mensagem) {
        // Lógica para tratar o envio da mensagem
        // Aqui você pode adicionar a lógica específica que deseja aplicar antes de enviar a mensagem para o SQS

        try {
            // Exemplo: Inserir dados no Redis
            redisInsercao.inserirDados("chave", mensagem);

            // Enviar mensagem para o SQS
            sqsEnvioMensagem.enviarMensagem(mensagem);
        } catch (Exception e) {
            // Tratar exceção caso ocorra algum erro durante o envio
            System.err.println("Erro ao enviar mensagem: " + e.getMessage());
        }
    }
}
