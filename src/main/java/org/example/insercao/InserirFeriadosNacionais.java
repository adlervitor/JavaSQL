package org.example.insercao;

import org.example.classes.FeriadosNacionais;
import org.example.dao.FeriadosNacionaisDAO;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.Scanner;

public class InserirFeriadosNacionais {
    public static void inserirFeriadoNacional(Connection connection) {
        FeriadosNacionaisDAO feriadosNacionaisDAO = new FeriadosNacionaisDAO(connection);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserir novo feriado nacional:");
        System.out.print("Digite a data no formato AAAA-MM-DD: ");
        String dataString = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataString);

        System.out.print("Digite a descrição do feriado: ");
        String descricao = scanner.nextLine();

        FeriadosNacionais novoFeriado = new FeriadosNacionais(data, descricao);
        feriadosNacionaisDAO.inserirFeriadoNacional(novoFeriado);

        System.out.println("Feriado nacional inserido com sucesso!");
    }
}

