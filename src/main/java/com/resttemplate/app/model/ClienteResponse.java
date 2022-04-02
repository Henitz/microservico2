package com.resttemplate.app.model;

public class ClienteResponse {

    private Integer id;
    private String nome;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }
}
