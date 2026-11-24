/*
 * Exercicio 10 - Injecao de Dependencias Manual:
 * Injeta uma implementacao de servico de notificacao dentro do processador de pedidos.
 */

import java.util.Scanner;

interface ServicoNotificacao {
    void enviar(String mensagem);
}

class NotificacaoEmail implements ServicoNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] Enviando mensagem: " + mensagem);
    }
}

class GestorPedidos {
    private ServicoNotificacao notificacao;

    public GestorPedidos(ServicoNotificacao servico) {
        this.notificacao = servico;
    }

    public void confirmarPedido(int codigoPedido) {
        System.out.println("Pedido " + codigoPedido + " confirmado com sucesso.");
        notificacao.enviar("Seu pedido #" + codigoPedido + " foi aprovado!");
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ServicoNotificacao email = new NotificacaoEmail();
        GestorPedidos gestor = new GestorPedidos(email);

        System.out.print("Digite o codigo do pedido: ");
        int pedido = sc.nextInt();

        gestor.confirmarPedido(pedido);

        sc.close();
    }
}
