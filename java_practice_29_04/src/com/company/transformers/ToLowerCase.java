package com.company.transformers;

public class ToLowerCase implements Transformer{

    @Override
    public boolean checkLength(String str) {
        return str.length()==2;
    }

    @Override
    public String transform(String str) {
        if (checkLength(str)) {
            return str.toLowerCase();
        }
        return str;
    }
}
