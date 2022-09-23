package com.company.functionInterfaces;

@FunctionalInterface
public interface MyConsumer <T>{
    void accept(T t);
}
