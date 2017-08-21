package com.jlarrieux.learning.springaoplearning;



import com.jlarrieux.learning.springaoplearning.Entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class Main {

    public static void main(String[] args){
        ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args);
//        System.out.print("\n\n\n\nREDDDDDD\n\n");
        Student student = ctx.getBean(Student.class);
        student.getAge();

    }




}
