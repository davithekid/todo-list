package com.example.todo_list.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

// basicamente meu entity serve para eu mexer nas minhas tabelas do database
// nele vou definir meus getters and setters

@Table(name = "todo") // tabela banco de dados
@Entity(name = "todo")
public class Todolist {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY) // aplicando config pro meu tipo de ID
    private Long id;

    private String nome;

    private String descricao;

    private boolean realizado;

    private int prioridade;

    // getters and setters
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
