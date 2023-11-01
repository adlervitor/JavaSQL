package org.example.dao;

import org.example.classes.EclipsesSolares;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EclipsesSolaresDAO {

    private Connection connection;

    public EclipsesSolaresDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirEclipseSolar(EclipsesSolares eclipse) {
        try {
            String query = "INSERT INTO eclipses_solares (data, tipo) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setObject(1, eclipse.getData());
            preparedStatement.setString(2, eclipse.getTipo());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Adicione métodos adicionais conforme necessário
}

