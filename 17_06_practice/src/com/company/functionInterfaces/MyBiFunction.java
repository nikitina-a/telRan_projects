package com.company.functionInterfaces;

@FunctionalInterface
public interface MyBiFunction <T,D,R>{

    R apply (T t,D d);

}
