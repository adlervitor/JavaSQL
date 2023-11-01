package org.example.dao;

import org.example.classes.CotacaoMoeda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CotacaoMoedaDAO {

    private Connection connection;

    public CotacaoMoedaDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirCotacao(CotacaoMoeda cotacaoMoeda) {
        try {
            String query = "INSERT INTO cotacao_moeda (moeda, valor) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cotacaoMoeda.getMoeda());
            preparedStatement.setDouble(2, cotacaoMoeda.getValor());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

