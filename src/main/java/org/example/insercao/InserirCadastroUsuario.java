package org.example.insercao;

import org.example.classes.CadastroUsuario;
import org.example.dao.CadastroUsuarioDAO;

import java.sql.Connection;
import java.util.Scanner;

public class InserirCadastroUsuario {

    public static void inserirCadastro(Connection connection) {
        CadastroUsuarioDAO cadastroUsuarioDAO = new CadastroUsuarioDAO(connection);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserir novo cadastro de usuário:");
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o e-mail do usuário: ");
        String email = scanner.nextLine();

        System.out.print("Digite o telefone do usuário: ");
        String telefone = scanner.nextLine();

        CadastroUsuario novoUsuario = new CadastroUsuario(nome, email, telefone);
        cadastroUsuarioDAO.inserirCadastro(novoUsuario);

        System.out.println("Cadastro de usuário inserido com sucesso!");
    }
}

