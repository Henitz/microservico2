package com.resttemplate.app.model;

public class Resposta {

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Resposta{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
