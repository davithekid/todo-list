package com.example.todo_list.controller;

import com.example.todo_list.entity.Todolist;
import com.example.todo_list.entity.TodolistResposeDTO;
import com.example.todo_list.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("todolist")
public class TodoController {

    @Autowired
    private TodoRepository repository;

    @GetMapping // get
    public List<TodolistResposeDTO> getAll() {
        List<TodolistResposeDTO> todolist = repository.findAll().stream().map(TodolistResposeDTO::new).toList();
        return todolist;
    }


}
