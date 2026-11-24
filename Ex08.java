/*
 * Exercicio 08 - Teste Unitario Manual (Padrao Assert):
 * Valida regras de negocio simulando testes unitarios com assertivas.
 */

import java.util.Scanner;

class CalculadoraDescontos {
    public static double aplicar(double valor, double perc) {
        return valor - (valor * (perc / 100.0));
    }
}

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Executando suite de testes automatizados...");

        double resultadoTeste = CalculadoraDescontos.aplicar(100.0, 10.0);
        if (resultadoTeste == 90.0) {
            System.out.println("[PASSOU] Teste 1: Desconto de 10% sobre 100 correto.");
        } else {
            System.out.println("[FALHOU] Teste 1: Valor inesperado: " + resultadoTeste);
        }

        System.out.print("Digite um valor para teste interativo: ");
        double valorDigitado = sc.nextDouble();
        System.out.println("Valor com 5% de desconto: " + CalculadoraDescontos.aplicar(valorDigitado, 5.0));

        sc.close();
    }
}
