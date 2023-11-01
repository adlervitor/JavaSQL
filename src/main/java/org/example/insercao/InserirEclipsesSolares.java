package org.example.insercao;

import org.example.classes.EclipsesSolares;
import org.example.dao.EclipsesSolaresDAO;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.Scanner;

public class InserirEclipsesSolares {

    public static void inserirEclipseSolar(Connection connection) {
        EclipsesSolaresDAO eclipsesSolaresDAO = new EclipsesSolaresDAO(connection);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserir novo eclipse solar:");
        System.out.print("Digite a data no formato AAAA-MM-DD: ");
        String dataString = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataString);

        System.out.print("Digite o tipo de eclipse: ");
        String tipo = scanner.nextLine();

        EclipsesSolares novoEclipseSolar = new EclipsesSolares(data, tipo);
        eclipsesSolaresDAO.inserirEclipseSolar(novoEclipseSolar);

        System.out.println("Eclipse solar inserido com sucesso!");
    }
}

