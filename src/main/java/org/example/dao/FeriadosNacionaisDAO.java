package org.example.dao;

import org.example.classes.FeriadosNacionais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeriadosNacionaisDAO {

    private Connection connection;

    public FeriadosNacionaisDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirFeriadoNacional(FeriadosNacionais feriado) {
        try {
            String query = "INSERT INTO feriados_nacionais (data, descricao) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setObject(1, feriado.getData());
            preparedStatement.setString(2, feriado.getDescricao());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
