package com.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependecy {

    @Override
    public void saludar() {
        System.out.println("hola mundo desde mi componente");
    }
    
}
