package com.company.functionInterfaces;

public class LambdaFactory {
    public static void main(String[] args) {
        //Написать следующие лямбды и интерфейсы, которые они будут использовать:
        // * 1.конкатинировать строки a и b=ab

        MyBiFunction<String,String,String> myBiFunction = (a,b)->a + b;
        System.out.println(myBiFunction.apply("Hallo ","World"));

        // * 2.ecли длина строки = 3 вернуть true иначе false

        MyPredicate<String> myPredicate1 = s -> s.length()==3;
        System.out.println(myPredicate1.test("Hey you"));

        // * 3.ecли длина строки = 4 вернуть true иначе false

        MyPredicate<String> myPredicate2 = s -> s.length()==4;
        System.out.println(myPredicate1.test("Hey you"));

        // * 4.вернуть строку в верхнем регистре
        MyFunction<String,String> myFunction = String::toUpperCase;
        System.out.println(myFunction.apply("hello"));

        // * 5.если длина строки 4 вернуть четыре звездочки иначе вернуть строку без изменений
        System.out.println(checkLengthAndReturn("hell",s -> s.length()==4));
        System.out.println(checkLengthAndReturn("hello you",s -> s.length()==4));

        // * 6.распечатать строку в виде !строка!
        MyConsumer<String> myConsumer = s-> System.out.println("!"+s+'!');
        myConsumer.accept("java");

        // * 7. печатает "Hello World"
        MyConsumer<String> myConsumer2 = System.out::println;
        myConsumer2.accept("Hello World");

    }
    // * 5.если длина строки 4 вернуть четыре звездочки иначе вернуть строку без изменений
    public static String checkLengthAndReturn(String string, MyPredicate<String> myPredicate) {
        if (myPredicate.test(string)) return "****";
        return string;
    }


}
