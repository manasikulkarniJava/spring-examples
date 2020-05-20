package com.manasi.example;

import com.manasi.example.beans.MathCheat;
import com.manasi.example.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
/*        System.out.println( "Hello World!" );
        Student student=new Student();
        MathCheat cheat=new MathCheat();
        student.setMathCheat(cheat);
        student.cheating();*/

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student student=context.getBean("student",Student.class);
        student.cheating();
    }
}
