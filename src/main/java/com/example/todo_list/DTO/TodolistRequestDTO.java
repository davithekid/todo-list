package com.example.todo_list.DTO;

// meu DTO para criar minha REQUEST
public record TodolistRequestDTO(String nome, String descricao, boolean realizado, Integer prioridade) {
}
