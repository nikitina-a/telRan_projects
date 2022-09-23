package com.company.transformers;

public class TransFormString {

    public static void main(String[] args) {
        System.out.println(transformString("aaa BB", new ToLowerCase()));

    }

    public static String transformString(String str, Transformer transformer) {
        if (str.isEmpty()) return "";
        var strings = str.split(" ");
        StringBuilder bd = new StringBuilder();
        for (String s : strings) {

            bd.append(transformer.transform(s)).append(" ");
        }
        return bd.toString().trim();
    }

}

