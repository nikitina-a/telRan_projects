package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {


    @Test
    void testLambdaLength3UpperCase(){
        String sentence = "Java is not hard";
        String expected = "Java is NOT hard";
        Assertions.assertEquals(expected,Main.transform(sentence,w->w.length()==3, String::toUpperCase));
    }

    @Test
    void testLambdaLength3LowerCase(){
        String sentence = "Java is NOT hard";
        String expected = "Java is not hard";
        Assertions.assertEquals(expected,Main.transform(sentence,w->w.length()==3, String::toLowerCase));
    }

    @Test
    void testLambdaLength4LowerCase(){
        String sentence = "Java is NOT HARD";
        String expected = "java is NOT hard";
        Assertions.assertEquals(expected,Main.transform(sentence,w->w.length()==4, String::toLowerCase));
    }

    @Test
    void testLambdaLength4UpperCase(){
        String sentence = "Java is NOT hard";
        String expected = "JAVA is NOT HARD";
        Assertions.assertEquals(expected,Main.transform(sentence,w->w.length()==4, String::toUpperCase));
    }

    @Test
    void testLambdaLength5Aesteriks(){
        String sentence = "Javas is NOT hard";
        String expected = "***** is NOT hard";
        Assertions.assertEquals(expected,Main.transform(sentence,w->w.length()==5, w->"*****"));
    }
}