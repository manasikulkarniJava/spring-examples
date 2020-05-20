package com.manasi.example;
import org.springframework.context.ApplicationContext;
import com.manasi.example.beans.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
        Student student= context.getBean("student",Student.class);
        student.displayStudentInfo();

        Student student1= context.getBean("student1",Student.class);
        student1.displayStudentInfo();

    }
}
