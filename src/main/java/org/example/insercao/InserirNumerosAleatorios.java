package org.example.insercao;

import org.example.classes.NumerosAleatorios;
import org.example.dao.NumerosAleatoriosDAO;

import java.sql.Connection;
import java.util.Random;

public class InserirNumerosAleatorios {
    public static void inserirNumeroAleatorio(Connection connection) {
        NumerosAleatoriosDAO numerosAleatoriosDAO = new NumerosAleatoriosDAO(connection);

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        NumerosAleatorios novoNumeroAleatorio = new NumerosAleatorios(numeroAleatorio);
        numerosAleatoriosDAO.inserirNumeroAleatorio(novoNumeroAleatorio);

        System.out.println("O número inserido foi: " + numeroAleatorio);
    }
}
