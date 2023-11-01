package org.example.insercao;

import org.example.classes.Estoque;
import org.example.dao.EstoqueDAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.Scanner;

public class InserirEstoque {

    public static void inserirEstoque(Connection connection) {
        EstoqueDAO estoqueDAO = new EstoqueDAO(connection);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserir novo item no estoque:");
        System.out.print("Digite o nome do item: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o valor: ");
        BigDecimal valor = new BigDecimal(scanner.nextLine());

        System.out.print("Digite a data da compra (AAAA-MM-DD): ");
        LocalDate dataCompra = LocalDate.parse(scanner.nextLine());

        Estoque novoItem = new Estoque(0, nome, quantidade, valor, dataCompra);
        estoqueDAO.inserirEstoque(novoItem);

        System.out.println("Item inserido no estoque com sucesso!");
    }
}
