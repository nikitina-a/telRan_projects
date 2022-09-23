package com.company;

public class Translator implements SpeakEnglish,SpeakRussian {
    private RussianSpeaker russianSpeaker;
    private EnglishSpeaker englishSpeaker;


    public Translator(RussianSpeaker russianSpeaker,EnglishSpeaker englishSpeaker) {
        this.englishSpeaker = englishSpeaker;
        this.russianSpeaker = russianSpeaker;
    }

    @Override
    public void sayHi() {
        russianSpeaker.sayPrivet();
        System.out.println("Hello");


    }

    @Override
    public void sayBye() {
        russianSpeaker.sayPoka();
        System.out.println("Bye");
    }


    @Override
    public void sayPrivet() {
        englishSpeaker.sayHi();
        System.out.println("Privet");

    }

    @Override
    public void sayPoka() {
        englishSpeaker.sayBye();
        System.out.println("Poka");

    }
}
