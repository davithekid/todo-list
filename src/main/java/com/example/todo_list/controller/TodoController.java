package com.example.todo_list.controller;

import com.example.todo_list.entity.TodolistResponseDTO;
import com.example.todo_list.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

// aqui estou mexendo diretamente na minha APIREST
// estou tratando sobre os metodos CRUD para subir pro meu http

@RestController // anotação que é uma RestControoller
@RequestMapping("todolist") // indicando meu endereço "/todolist"
public class TodoController {

    // ""construtor""
    @Autowired
    private TodoRepository repository;

    // metodo get
    @GetMapping

    // DTO - data transfer object
    // para usar no res/send das nossas resquisições
    public List<TodolistResponseDTO> getAll() {

        // metodo stream ele coloca os dados em um funil, e no map a gente cria um DTO e transforma em uma lista
        List<TodolistResponseDTO> todolist = repository.findAll().stream().map(TodolistResponseDTO::new).toList();
        return todolist;
    }


}
