package com.example.beanlifecycle.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "com/example/beanlifecycle/lifecycle"
        );
        context.close();
    }
}
