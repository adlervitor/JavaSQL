package org.example.classes;

public class CotacaoMoeda {
    private int id;
    private String moeda;
    private double valor;

    public CotacaoMoeda(String moeda, double valor) {
        this.moeda = moeda;
        this.valor = valor;
    }

    public CotacaoMoeda() {

    }

    public int getId() {
        return id;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

