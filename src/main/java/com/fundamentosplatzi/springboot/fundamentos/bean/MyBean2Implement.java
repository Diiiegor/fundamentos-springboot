package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBean2Implement implements MyBean{

    @Override
    public void print() {
        System.out.println("Hola Desde mi implementacion propia del bean 2");
    }
}
