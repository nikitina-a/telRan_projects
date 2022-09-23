package com.company.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        String brackets1 = "()({})"; //true
        String brackets2 = "(({})"; //false
        System.out.println(validBrackets(brackets1));
        System.out.println(validBrackets(brackets2));


    }

    //valid brackets
    public static boolean validBrackets(String string) {
        String openingBrackets = "([{";
        String closingBrackets = ")]}";
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put('}', '{');
        matchingBrackets.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (openingBrackets.indexOf(letter) != -1) {
                stack.push(letter);
            } else if (closingBrackets.indexOf(letter) != -1) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == matchingBrackets.get(letter)) {
                    stack.pop();
                } else {
                    return false;
                }

            }

        }
        return stack.isEmpty();

    }
}
