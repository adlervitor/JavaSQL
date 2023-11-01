package org.example.classes;

import java.time.LocalDate;

public class FeriadosNacionais {
    private int id;
    private LocalDate data;
    private String descricao;

    public FeriadosNacionais(LocalDate data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
