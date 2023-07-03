package com.avinashcodes.lazyinitializationexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class DependencyA {

    DependencyB dependencyB;


    public DependencyA(DependencyB dependencyB){
        System.out.println("Some initialization logics");
        this.dependencyB=dependencyB;
    }


}
