/*
 * Exercicio 13 - Records no Java Moderno:
 * Utilizacao de record para criar classes de dados imutaveis de forma concisa.
 */

import java.util.Scanner;

record UsuarioRecord(String nomeCompleto, String emailCorporativo) {}

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o email corporativo: ");
        String email = sc.nextLine();

        UsuarioRecord usuario = new UsuarioRecord(nome, email);

        System.out.println("Usuario Record criado: " + usuario);
        System.out.println("Acesso direto aos campos: " + usuario.nomeCompleto() + " <" + usuario.emailCorporativo() + ">");

        sc.close();
    }
}
