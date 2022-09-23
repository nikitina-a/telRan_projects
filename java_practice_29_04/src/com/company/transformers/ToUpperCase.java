package com.company.transformers;

public class ToUpperCase implements Transformer{


    @Override
    public boolean checkLength(String str) {
        return str.length()==3;
    }

    @Override
    public String transform(String str) {
        if (checkLength(str)) {
            return str.toUpperCase();
        }
        return str;
    }
}
