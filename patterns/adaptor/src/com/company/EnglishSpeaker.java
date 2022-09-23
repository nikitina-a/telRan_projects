package com.company;

public class EnglishSpeaker implements SpeakEnglish{
    @Override
    public void sayHi() {
        System.out.println("Hello");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye");

    }
}
