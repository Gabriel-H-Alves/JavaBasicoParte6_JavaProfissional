/*
 * Exercicio 03 - Java NIO.2 (Files e Path):
 * Utiliza Files.writeString e Files.readString para leitura e escrita moderna de arquivos.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Path caminhoArquivo = Paths.get("relatorio_rapido.txt");

        System.out.print("Digite o conteudo do relatorio: ");
        String textoDigitado = sc.nextLine();

        try {
            Files.writeString(caminhoArquivo, textoDigitado);
            System.out.println("Arquivo criado com NIO.2!");

            String conteudoLido = Files.readString(caminhoArquivo);
            System.out.println("Conteudo recuperado: " + conteudoLido);
        } catch (IOException erro) {
            System.out.println("Erro ao manipular arquivo via NIO: " + erro.getMessage());
        }

        sc.close();
    }
}
