package org.example.dao;

import org.example.classes.Estoque;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EstoqueDAO {

    private final Connection connection;

    public EstoqueDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirEstoque(Estoque estoque) {
        try {
            String query = "INSERT INTO estoque (nome, quantidade, valor, data_compra) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, estoque.getNome());
            preparedStatement.setInt(2, estoque.getQuantidade());
            preparedStatement.setBigDecimal(3, estoque.getValor());
            preparedStatement.setDate(4, java.sql.Date.valueOf(estoque.getDataCompra()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
