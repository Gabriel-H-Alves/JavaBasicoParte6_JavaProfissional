/*
 * Exercicio 01 - Java I/O (FileWriter e PrintWriter):
 * Escreve dados informados pelo usuario em um arquivo de texto local.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma anotacao para salvar no arquivo: ");
        String anotacaoUsuario = sc.nextLine();

        try (FileWriter escritorArquivo = new FileWriter("anotacoes.txt", true);
             PrintWriter formatadorArquivo = new PrintWriter(escritorArquivo)) {
            formatadorArquivo.println(anotacaoUsuario);
            System.out.println("Anotacao gravada com sucesso em anotacoes.txt!");
        } catch (IOException erro) {
            System.out.println("Erro ao gravar arquivo: " + erro.getMessage());
        }

        sc.close();
    }
}
