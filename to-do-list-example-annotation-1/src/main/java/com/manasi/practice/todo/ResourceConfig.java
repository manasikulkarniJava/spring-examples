package com.manasi.practice.todo;

import com.manasi.practice.todo.beans.ToDo;
import com.manasi.practice.todo.dao.ToDoRepository;
import com.manasi.practice.todo.utils.Operation;
import com.manasi.practice.todo.utils.ToDoOperations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfig {
    @Bean
    public Operation operation() {
        return new Operation(toDoOperations());
    }

    @Bean
    public ToDoOperations toDoOperations() {
        return new ToDoOperations(toDoRepository());
    }

    @Bean
    public ToDoRepository toDoRepository() {
        return new ToDoRepository();
    }
}