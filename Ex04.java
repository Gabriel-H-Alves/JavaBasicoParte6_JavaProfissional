/*
 * Exercicio 04 - JDBC Simulado (Padrao DAO - Data Access Object):
 * Simula a persistencia de um cliente em banco de dados usando o padrao DAO.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ClienteEntidade {
    int codigoCliente;
    String nomeCliente;

    public ClienteEntidade(int codigo, String nome) {
        this.codigoCliente = codigo;
        this.nomeCliente = nome;
    }
}

class ClienteDaoMemoria {
    private List<ClienteEntidade> tabelaClientes = new ArrayList<>();

    public void salvar(ClienteEntidade cliente) {
        tabelaClientes.add(cliente);
        System.out.println("INSERT INTO cliente VALUES (" + cliente.codigoCliente + ", '" + cliente.nomeCliente + "')");
    }

    public List<ClienteEntidade> listarTodos() {
        return tabelaClientes;
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClienteDaoMemoria dao = new ClienteDaoMemoria();

        System.out.print("Codigo do cliente: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        dao.salvar(new ClienteEntidade(codigo, nome));

        System.out.println("Total de clientes no banco simulado: " + dao.listarTodos().size());

        sc.close();
    }
}
