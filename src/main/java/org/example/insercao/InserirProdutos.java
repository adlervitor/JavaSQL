package org.example.insercao;

import org.example.classes.Produtos;
import org.example.dao.ProdutosDAO;

import java.sql.Connection;
import java.util.Scanner;

public class InserirProdutos {

    public static void inserirProduto(Connection connection) {
        ProdutosDAO produtosDAO = new ProdutosDAO(connection);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserir novo produto:");
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = Double.parseDouble(scanner.nextLine());

        Produtos novoProduto = new Produtos(nome, preco);
        produtosDAO.inserirProduto(novoProduto);

        System.out.println("Produto inserido com sucesso!");
    }
}

