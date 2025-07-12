package com.example.todo_list.controller;

import com.example.todo_list.DTO.UpdateTodoDTO;
import com.example.todo_list.entity.Todolist;
import com.example.todo_list.DTO.TodolistRequestDTO;
import com.example.todo_list.DTO.TodolistResponseDTO;
import com.example.todo_list.repository.TodoRepository;
import com.example.todo_list.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // define que esta classe é um controlador REST
@RequestMapping("todolist") // define o endpoint base: /todolist
public class TodoController {

    @Autowired
    private TodoRepository repository; // injeção do repositório que interage com o banco de dados
    private TodoService service;

    public TodoController(TodoRepository repository, TodoService service) {
        this.repository = repository;
        this.service = service;
    }

    //GET.
    @GetMapping
    public List<TodolistResponseDTO> getAll() {
        // Busca todos os registros, transforma cada um em um DTO de resposta e retorna como lista
        return repository.findAll()
                .stream()
                .map(TodolistResponseDTO::new)
                .toList();
    }

    //POST.
    @PostMapping
    public void saveTodolist(@RequestBody TodolistRequestDTO data) {
        // Cria um novo objeto Todolist a partir do DTO recebido
        Todolist todolistData = new Todolist(data);

        // Salva o objeto no banco de dados
        repository.save(todolistData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build(); // Retorna 204 No Content
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateById(@PathVariable("id") Long id, @RequestBody UpdateTodoDTO updateTodoDTO){
        service.update(id, updateTodoDTO);
        return  ResponseEntity.noContent().build();
    }

}
