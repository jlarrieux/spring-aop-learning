package com.jlarrieux.learning.springaoplearning.Aspect;



import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class Logging {


    @Pointcut("execution(* com.jlarrieux.learning.springaoplearning.Entity.*.*(..))")
    private void selectAll(){

    }


    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("Printing stuff!!!");
    }


}
