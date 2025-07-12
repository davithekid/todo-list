package com.example.todo_list.service;

import com.example.todo_list.DTO.UpdateTodoDTO;
import com.example.todo_list.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public void deleteById(Long id) {
        if (!todoRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Tarefa não encontrada");
        }
        todoRepository.deleteById(id);
    }

    public void update(Long id, UpdateTodoDTO updateTodoDTO) {
        if (!todoRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Tarefa não encontrada");
        }

        var todoEntity = todoRepository.findById(id);
        var todo = todoEntity.get();

        if (updateTodoDTO.nome() != null) {
            todo.setNome(updateTodoDTO.nome());
        }
        if (updateTodoDTO.descricao() != null) {
            todo.setDescricao(updateTodoDTO.descricao());
        }
        if (updateTodoDTO.prioridade() != null) {
            todo.setPrioridade(updateTodoDTO.prioridade());
        }
        if (todo.isRealizado() != updateTodoDTO.realizado()) {
            todo.setRealizado(updateTodoDTO.realizado());
        }

        todoRepository.save(todo);
    }
}
