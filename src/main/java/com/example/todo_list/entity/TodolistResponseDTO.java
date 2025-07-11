package com.example.todo_list.entity;

// record pois ele é usado para representar os dados, APENAS PARA DADOS ESTATICOS!

// criando meu construtor e declarando minhas propriedades (VINDO DO MEU ENTITY)
public record TodolistResponseDTO(Long id, String nome, String descricao, boolean realizado, int prioridade) {
    public TodolistResponseDTO(Todolist todolist){
        this(todolist.getId(), todolist.getNome(), todolist.getDescricao(), todolist.isRealizado(), todolist.getPrioridade());
    }
}
