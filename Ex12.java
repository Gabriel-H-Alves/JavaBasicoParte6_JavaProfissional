/*
 * Exercicio 12 - ExecutorService e Pool de Threads:
 * Executa tarefas concorrentes utilizando um pool gerenciado (Executors).
 */

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de tarefas em lote (ex: 3): ");
        int totalTarefas = sc.nextInt();

        ExecutorService pool = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= totalTarefas; i++) {
            final int idTarefa = i;
            pool.execute(() -> {
                System.out.println("Tarefa " + idTarefa + " sendo processada por: " + Thread.currentThread().getName());
            });
        }

        pool.shutdown();
        System.out.println("Todas as tarefas foram despachadas para o ExecutorService.");

        sc.close();
    }
}
