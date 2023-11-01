package org.example.dao;

import org.example.classes.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutosDAO {

    private Connection connection;

    public ProdutosDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirProduto(Produtos produto) {
        try {
            String query = "INSERT INTO produtos (nome, preco) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setDouble(2, produto.getPreco());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Outros métodos
}

