package org.example.dao;

import org.example.classes.CadastroUsuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroUsuarioDAO {

    private Connection connection;

    public CadastroUsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirCadastro(CadastroUsuario cadastroUsuario) {
        try {
            String query = "INSERT INTO cadastro_usuario (nome, email, telefone) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cadastroUsuario.getNome());
            preparedStatement.setString(2, cadastroUsuario.getEmail());
            preparedStatement.setString(3, cadastroUsuario.getTelefone());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Adicione métodos adicionais conforme necessário
}

