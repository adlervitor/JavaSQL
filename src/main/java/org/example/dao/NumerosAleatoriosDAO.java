package org.example.dao;

import org.example.classes.NumerosAleatorios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NumerosAleatoriosDAO {

    private Connection connection;

    public NumerosAleatoriosDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirNumeroAleatorio(NumerosAleatorios numerosAleatorios) {
        try {
            String query = "INSERT INTO numeros_aleatorios (numero) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, numerosAleatorios.getNumero());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
