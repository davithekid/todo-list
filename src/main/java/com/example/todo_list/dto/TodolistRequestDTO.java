package com.example.todo_list.dto;

// meu DTO para criar minha REQUEST
public record TodolistRequestDTO(String nome, String descricao, boolean realizado, int prioridade) {
}
