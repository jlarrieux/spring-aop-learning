package com.jlarrieux.learning.springaoplearning.Entity;



import org.springframework.stereotype.Component;



@Component
public class Student {

    private int age;
    private String name;


//    public Student(String name, int age){
//        this.age = age;
//        this.name = name;
//
//        getAge();
//
//    }

    public String getName(){
        return "Name: " + name;
    }


    public String getAge(){
        return String.format("Age: %d", age);
    }

    public void setAge(int age){
        this.age = age;
    }



}
