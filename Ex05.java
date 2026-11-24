/*
 * Exercicio 05 - Threads (Implementando Runnable):
 * Executa uma tarefa em segundo plano paralela a thread principal.
 */

import java.util.Scanner;

class TarefaProcessamento implements Runnable {
    private String nomeTarefa;

    public TarefaProcessamento(String nome) {
        this.nomeTarefa = nome;
    }

    @Override
    public void run() {
        System.out.println("Iniciando execucao da thread: " + nomeTarefa);
        for (int i = 1; i <= 3; i++) {
            System.out.println(nomeTarefa + " processando etapa " + i);
        }
        System.out.println("Thread " + nomeTarefa + " finalizada!");
    }
}

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do processo em segundo plano: ");
        String nomeProcesso = sc.nextLine();

        Thread novaThread = new Thread(new TarefaProcessamento(nomeProcesso));
        novaThread.start();

        System.out.println("Thread principal main continuou sem bloquear.");

        try {
            novaThread.join();
        } catch (InterruptedException erro) {
            System.out.println("Thread interrompida.");
        }

        sc.close();
    }
}
