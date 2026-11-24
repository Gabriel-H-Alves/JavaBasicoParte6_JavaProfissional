/*
 * Exercicio 15 - Padrao Builder:
 * Construcao fluente de objetos complexos (Pedido) utilizando Builder.
 */

import java.util.Scanner;

class PedidoVenda {
    int id;
    String cliente;
    double valorTotal;

    private PedidoVenda() {}

    public static class Builder {
        private PedidoVenda pedido = new PedidoVenda();

        public Builder comId(int id) {
            pedido.id = id;
            return this;
        }

        public Builder paraCliente(String cliente) {
            pedido.cliente = cliente;
            return this;
        }

        public Builder comValor(double valor) {
            pedido.valorTotal = valor;
            return this;
        }

        public PedidoVenda build() {
            return pedido;
        }
    }
}

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String cliente = sc.nextLine();

        System.out.print("Valor do pedido: ");
        double valor = sc.nextDouble();

        PedidoVenda pedido = new PedidoVenda.Builder()
                .comId(501)
                .paraCliente(cliente)
                .comValor(valor)
                .build();

        System.out.println("Pedido criado via Builder: #" + pedido.id + " para " + pedido.cliente + " no valor de R$ " + pedido.valorTotal);

        sc.close();
    }
}
