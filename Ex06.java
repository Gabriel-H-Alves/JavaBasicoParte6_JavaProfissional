/*
 * Exercicio 06 - Concorrencia com Synchronized:
 * Controle de concorrencia em saldo compartilhado entre threads.
 */

import java.util.Scanner;

class ContaCompartilhada {
    private double saldo = 1000.0;

    public synchronized void sacar(double valor, String responsavel) {
        if (saldo >= valor) {
            System.out.println(responsavel + " esta sacando R$ " + valor);
            saldo -= valor;
            System.out.println("Novo saldo: R$ " + saldo);
        } else {
            System.out.println(responsavel + " tentou sacar, mas nao ha saldo suficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCompartilhada conta = new ContaCompartilhada();

        System.out.print("Digite o valor do primeiro saque: ");
        double saque01 = sc.nextDouble();

        System.out.print("Digite o valor do segundo saque: ");
        double saque02 = sc.nextDouble();

        Thread t1 = new Thread(() -> conta.sacar(saque01, "Usuario A"));
        Thread t2 = new Thread(() -> conta.sacar(saque02, "Usuario B"));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException erro) {
            System.out.println("Falha na sincronizacao.");
        }

        System.out.println("Saldo final seguro: R$ " + conta.getSaldo());

        sc.close();
    }
}
