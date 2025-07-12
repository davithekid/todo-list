package com.example.todo_list.DTO;

// record pois ele é usado para representar os dados, APENAS PARA DADOS ESTATICOS!

import com.example.todo_list.entity.Todolist;

// criando meu construtor e declarando minhas propriedades (VINDO DO MEU ENTITY)
public record TodolistResponseDTO(Long id, String nome, String descricao, boolean realizado, Integer prioridade) {
    public TodolistResponseDTO(Todolist todolist){
        this(todolist.getId(), todolist.getNome(), todolist.getDescricao(), todolist.isRealizado(), todolist.getPrioridade());
    }
}
