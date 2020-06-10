package com.manasi.practice.todo;

import com.manasi.practice.todo.beans.ToDo;
import com.manasi.practice.todo.utils.Operation;
import com.manasi.practice.todo.utils.ToDoOperations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class ToDoDemo {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Operation operation = context.getBean("operation", Operation.class);
        operation.performOperation();
    }
}
