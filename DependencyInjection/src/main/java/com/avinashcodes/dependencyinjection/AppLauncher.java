package com.avinashcodes.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.avinashcodes.dependencyinjection")
public class AppLauncher {


    public static void main(String[] args) {


        ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppLauncher.class);

        SetterBasedDemo setterBasedDemo = ctxt.getBean(SetterBasedDemo.class);
        System.out.println(setterBasedDemo);

        FiledBasedDemo filedBasedDemo = ctxt.getBean(FiledBasedDemo.class);
        System.out.println(filedBasedDemo);

        ConstructorBasedDemo constructorBasedDemo = ctxt.getBean(ConstructorBasedDemo.class);
        System.out.println(constructorBasedDemo);











    }




}
