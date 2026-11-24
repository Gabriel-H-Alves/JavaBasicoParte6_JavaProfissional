/*
 * Exercicio 07 - Logging com java.util.logging.Logger:
 * Registra eventos informativos e alertas usando Logger oficial da JDK.
 */

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex07 {
    private static final Logger LOGGER = Logger.getLogger(Ex07.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LOGGER.info("Aplicacao iniciada com sucesso.");

        System.out.print("Digite um valor de transacao: ");
        double valorTransacao = sc.nextDouble();

        if (valorTransacao > 5000.0) {
            LOGGER.log(Level.WARNING, "Alerta: Transacao de alto valor detectada: R$ " + valorTransacao);
        } else {
            LOGGER.info("Transacao normal processada.");
        }

        sc.close();
    }
}
