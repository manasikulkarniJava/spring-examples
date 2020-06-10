package com.manasi.practice.todo.utils;

import com.manasi.practice.todo.beans.ToDo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Operation {

    public void setToDoOperations(ToDoOperations toDoOperations) {
        this.toDoOperations = toDoOperations;
    }

    ToDoOperations toDoOperations = null;

    static final Scanner scanner = new Scanner(System.in);

    public Operation() {

    }

    public void performOperation()
    {
        this.toDoOperations = toDoOperations;
        int input = 1;
        do {
            System.out.println("please provide input");
            System.out.println("1 -Insert");
            System.out.println("2 -Delete");
            System.out.println("3 -Display");
            System.out.println("4 -Quit");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    this.insertToDo();
                    break;
                case 2:
                    this.deleteToDo();
                    break;
                case 3:
                    this.displayToDo();
                    break;
                case 4:
                    break;
            }
        } while (input != 4);
    }

    public void displayToDo() {
        List<ToDo> list = toDoOperations.display();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void deleteToDo() {
        System.out.println("Enter ID");
        int id = scanner.nextInt();  // Read user input
        toDoOperations.remove(id);
    }

    public void insertToDo() {
        System.out.println("Enter ID");
        int id = scanner.nextInt();  // Read user input
        System.out.println("Enter Description");
        String description = scanner.next();  // Read user input
        toDoOperations.add(new ToDo(id, description));
    }
}

