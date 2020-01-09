package org.launchcode.java.studios.countingcharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        System.out.println("Enter a custom quote (leave blank to use default quote): ");
        String customQuote = input.nextLine();
        if (!customQuote.equals("")){
            quote= customQuote;
        }
        
        char[] quoteChars = quote.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        char currentChar;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < quoteChars.length; i++) {
            currentChar = Character.toLowerCase(quoteChars[i]);
            if (charMap.containsKey(currentChar)){
                int newCount = charMap.get(currentChar);
                newCount++;
                charMap.put(currentChar, newCount);
                continue;
            } else if (alphabet.contains(currentChar + "")) {
                charMap.put(currentChar, 1);
            }
        }
        System.out.println(charMap.entrySet());
    }
}
