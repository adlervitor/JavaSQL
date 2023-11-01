package org.example.insercao;

import org.example.classes.CotacaoMoeda;
import org.example.dao.CotacaoMoedaDAO;

import java.sql.Connection;
import java.util.Scanner;

public class InserirCotacaoMoeda {
    public static void inserirCotacao(Connection connection) {
        CotacaoMoedaDAO cotacaoMoedaDAO = new CotacaoMoedaDAO(connection);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserir nova cotação de moeda:");
        System.out.print("Digite o nome da moeda: ");
        String nomeMoeda = scanner.nextLine();

        System.out.print("Digite o valor da cotação: ");
        double valorCotacao = Double.parseDouble(scanner.nextLine());

        CotacaoMoeda novaCotacao = new CotacaoMoeda(nomeMoeda, valorCotacao);
        cotacaoMoedaDAO.inserirCotacao(novaCotacao);

        System.out.println("Cotação de moeda inserida com sucesso!");
    }
}
