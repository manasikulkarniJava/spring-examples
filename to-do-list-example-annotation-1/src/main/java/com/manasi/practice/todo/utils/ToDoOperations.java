package com.manasi.practice.todo.utils;

import com.manasi.practice.todo.beans.ToDo;
import com.manasi.practice.todo.dao.ToDoRepository;

import java.util.List;

public class ToDoOperations {

    public ToDoOperations(ToDoRepository toDoRepository)
    {
        this.toDoRepository = toDoRepository;
    }

    private ToDoRepository toDoRepository;

    public void add(ToDo toDo) {
        toDoRepository.add(toDo);
    }

    public void remove(int id) {
        toDoRepository.remove(id);
    }

    public List<ToDo> display() {
        return toDoRepository.display();
    }
}
