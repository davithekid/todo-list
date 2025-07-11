package com.example.todo_list.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "todos") // informando o nome da tabela, sempre no plural
public class Todo {

    // aqui estou mexendo na criação do meu id
    // adotando uma estrategia que ele é um ID de tipo codificado (UUID)
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;

    // logo abaixo criando meus getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
