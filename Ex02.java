/*
 * Exercicio 02 - Java I/O (BufferedReader e FileReader):
 * Le o arquivo anotacoes.txt e exibe as linhas no console.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lendo o conteudo de anotacoes.txt:");

        try (BufferedReader leitorArquivo = new BufferedReader(new FileReader("anotacoes.txt"))) {
            String linhaAtual;
            int numeroLinha = 1;
            while ((linhaAtual = leitorArquivo.readLine()) != null) {
                System.out.println(numeroLinha + ": " + linhaAtual);
                numeroLinha++;
            }
        } catch (IOException erro) {
            System.out.println("Arquivo ainda nao existe ou nao pode ser lido: " + erro.getMessage());
        }

        sc.close();
    }
}
