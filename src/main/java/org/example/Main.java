package org.example;

import org.example.insercao.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "1234";

        try {
            connection = DriverManager.getConnection(url, username, password);

            Scanner scanner = new Scanner(System.in);
            int opcao;
            do {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Inserir Produto");
                System.out.println("2. Inserir Eclipse Solar");
                System.out.println("3. Inserir Cadastro de Usuário");
                System.out.println("4. Inserir Cotação de Moeda");
                System.out.println("5. Inserir Feriado Nacional");
                System.out.println("6. Inserir Número Aleatório");
                System.out.println("7. Inserir Estoque");
                System.out.println("0. Sair");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        InserirProdutos.inserirProduto(connection);
                        break;
                    case 2:
                        InserirEclipsesSolares.inserirEclipseSolar(connection);
                        break;
                    case 3:
                        InserirCadastroUsuario.inserirCadastro(connection);
                        break;
                    case 4:
                        InserirCotacaoMoeda.inserirCotacao(connection);
                        break;
                    case 5:
                        InserirFeriadosNacionais.inserirFeriadoNacional(connection);
                        break;
                    case 6:
                        InserirNumerosAleatorios.inserirNumeroAleatorio(connection);
                        break;
                    case 7:
                        InserirEstoque.inserirEstoque(connection);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
