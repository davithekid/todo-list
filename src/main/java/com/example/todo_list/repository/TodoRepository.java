package com.example.todo_list.repository;

import com.example.todo_list.entity.Todolist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todolist, Long> {

}
