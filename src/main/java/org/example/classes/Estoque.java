package org.example.classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Estoque {

    private int id;
    private String nome;
    private int quantidade;
    private BigDecimal valor;
    private LocalDate dataCompra;

    public Estoque(int id, String nome, int quantidade, BigDecimal valor, LocalDate dataCompra) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dataCompra = dataCompra;
    }

    public Estoque() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }
}
