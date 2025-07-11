package com.example.todo_list.entity;

public record TodolistResposeDTO(Long id, String nome, String descricao, boolean realizado, int prioridade) {
    public TodolistResposeDTO(Todolist todolist){
        this(todolist.getId(), todolist.getNome(), todolist.getDescricao(), todolist.isRealizado(), todolist.getPrioridade());
    }
}
