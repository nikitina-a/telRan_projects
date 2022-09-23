package com.company.functionInterfaces;
@FunctionalInterface
public interface MyFunction <T,R>{
    R apply(T t);
}
