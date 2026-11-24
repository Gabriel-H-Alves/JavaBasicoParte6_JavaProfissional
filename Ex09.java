/*
 * Exercicio 09 - Arquitetura em Camadas (Controller -> Service -> Repository):
 * Demonstra a separacao de responsabilidades tipica do ecossistema Spring.
 */

import java.util.Scanner;

class UsuarioRepositorio {
    public void salvarNoBanco(String nome) {
        System.out.println("[Repository] Gravando usuario no banco: " + nome);
    }
}

class UsuarioServico {
    private UsuarioRepositorio repositorio = new UsuarioRepositorio();

    public void cadastrar(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            System.out.println("[Service] Validacoes de negocio concluidas.");
            repositorio.salvarNoBanco(nome);
        } else {
            System.out.println("[Service] Nome invalido para cadastro.");
        }
    }
}

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioServico servico = new UsuarioServico();

        System.out.print("Digite o nome para cadastro em camadas: ");
        String nomeDigitado = sc.nextLine();

        servico.cadastrar(nomeDigitado);

        sc.close();
    }
}
