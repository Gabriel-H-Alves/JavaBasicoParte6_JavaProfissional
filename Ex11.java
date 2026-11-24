/*
 * Exercicio 11 - DTO (Data Transfer Object) e Model:
 * Converte dados de requisicao externa (DTO) para entidade de dominio.
 */

import java.util.Scanner;

class ProdutoDto {
    String nomeRecebido;
    double precoRecebido;
}

class ProdutoEntidade {
    int id;
    String nome;
    double preco;

    public ProdutoEntidade(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoDto dto = new ProdutoDto();

        System.out.print("Digite o nome do produto recebido na API: ");
        dto.nomeRecebido = sc.nextLine();

        System.out.print("Digite o preco: ");
        dto.precoRecebido = sc.nextDouble();

        ProdutoEntidade entidade = new ProdutoEntidade(101, dto.nomeRecebido, dto.precoRecebido);

        System.out.println("Entidade persistida -> ID: " + entidade.id + " | Nome: " + entidade.nome + " | Preco: R$ " + entidade.preco);

        sc.close();
    }
}
