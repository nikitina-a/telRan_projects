package com.company;

public class Main {

    public static void main(String[] args) {
	EnglishSpeaker englishSpeaker = new EnglishSpeaker();
    RussianSpeaker russianSpeaker = new RussianSpeaker();
    Translator translator = new Translator(russianSpeaker,englishSpeaker);

    englishSpeaker.sayHi();
    System.out.println("Translate to russian speaker");
    translator.sayPrivet();

    russianSpeaker.sayPrivet();
    System.out.println("Translate to english speaker");
    translator.sayBye();






    }
}
