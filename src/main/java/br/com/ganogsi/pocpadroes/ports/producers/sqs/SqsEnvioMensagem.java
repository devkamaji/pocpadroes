package br.com.ganogsi.pocpadroes.ports.producers.sqs;

import org.springframework.stereotype.Service;

@Service
public class SqsEnvioMensagem {

    public void enviarMensagem(String mensagem) {
        // Lógica para enviar a mensagem para o SQS
        System.out.println("Mensagem enviada para o SQS: " + mensagem);
    }

    public void enviarMensagemComDelay(String mensagem, int delay) {
        // Lógica para enviar a mensagem com delay para o SQS
        System.out.println("Mensagem enviada para o SQS com delay de " + delay + " segundos: " + mensagem);
    }
}
