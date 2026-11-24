/*
 * Exercicio 14 - LocalDate e DateTimeFormatter (java.time):
 * Manipulacao e formatacao moderna de datas em sistemas Java.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data atual do sistema: " + hoje.format(formatador));

        System.out.print("Quantos dias de prazo de entrega? ");
        int diasPrazo = sc.nextInt();

        LocalDate dataEntrega = hoje.plusDays(diasPrazo);
        System.out.println("Data prevista de entrega: " + dataEntrega.format(formatador));

        sc.close();
    }
}
