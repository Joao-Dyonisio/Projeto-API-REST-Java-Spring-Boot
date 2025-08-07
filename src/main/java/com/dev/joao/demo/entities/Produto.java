package com.dev.joao.demo.entities;

public class Produto {

    private Long id;
    private String nome;
    private Double preco;

    private Departamento departamento;

    public Produto(){
    }

    public Produto (Long id, Departamento departamento, Double preco, String nome) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
