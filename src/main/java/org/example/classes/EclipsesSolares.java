package org.example.classes;

import java.time.LocalDate;

public class EclipsesSolares {
    private int id;
    private LocalDate data;
    private String tipo;

    public EclipsesSolares(LocalDate data, String tipo) {
        this.data = data;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
