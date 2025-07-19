package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("Hello"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));


    }

    public static boolean checkForPalindrome(String word) {
        word = word.replaceAll("[.,?!_\\-\\s]", "").toLowerCase();
        StringBuilder polCheckWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            polCheckWord.append(word.charAt(i));
        }
        return word.equals(polCheckWord.toString());
    }

    public static String convertDecimalToBinary(int decimal) {
        LinkedList<Integer> binaryList = new LinkedList<>();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal = decimal / 2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int digit : binaryList) {
            stringBuilder.append(digit);
        }
        return stringBuilder.toString();
    }

}