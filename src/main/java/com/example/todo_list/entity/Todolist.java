package com.example.todo_list.entity;

import com.example.todo_list.dto.TodolistRequestDTO;
import jakarta.persistence.*;

@Table(name = "todo")
@Entity(name = "todo")
public class Todolist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;

    public Todolist() {
    }

    public Todolist(TodolistRequestDTO data) {
        this.nome = data.nome();
        this.descricao = data.descricao();
        this.realizado = data.realizado();
        this.prioridade = data.prioridade();
    }

    // Getters e Setters...

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
