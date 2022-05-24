package com.kenzie.app;

import java.util.Scanner;

public class Main {

    public static String findLongestWord(String inputString) {

        String longestWord;
        String[] wordArray;
        // code help from
        // https://www.delftstack.com/howto/java/how-to-remove-punctuation-from-string-in-java/#:~:text=Remove%20Punctuation%20From%20String%20Using,means%20all%20the%20punctuation%20symbols.
        wordArray = inputString.trim().replaceAll("[.,!?\"]", "").split(" ");
        longestWord = "";
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > longestWord.length()) {
                longestWord = wordArray[i];
            }
        }
        return longestWord;
    }

    public static String findShortestWord(String inputString) {

        //https://stackoverflow.com/questions/25829866/finding-the-shortest-word-in-an-array-of-strings-java
        String[] wordArray;
        // code help from: https://www.delftstack.com/howto/java/how-to-remove-punctuation-from-string-in-java/#:~:text=Remove%20Punctuation%20From%20String%20Using,means%20all%20the%20punctuation%20symbols.
        // code help from: https://regexone.com/
        wordArray = inputString.trim().replaceAll("[.,!?\"]", "").split(" ");
        String shortestWord = wordArray[0];

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() < shortestWord.length()) {
                shortestWord = wordArray[i];
                if (wordArray.length == 1 && wordArray[0].equals("")) ;
                shortestWord = shortestWord;
                break;
            }
        }
        return shortestWord;
    }


    public static int findNumberOfWords(String inputString) {
        int count = 0;
        String[] wordArray = new String[0];
        wordArray = inputString.replaceAll("[,.?!\"]", "").split(" ");

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].isEmpty()) {

            } else
                count++;
        }
        return count;
    }


    public static int findNumberOfCommas(String inputString) {

        String[] wordArray;
        wordArray = inputString.split(" ");
        int count = 0;
        for (int i = 0; i < wordArray.length; i++) {
            char[] eachCommaInArray = wordArray[i].toCharArray();
            for (int j = 0; j < eachCommaInArray.length; j++) {
                if ((eachCommaInArray[j] == ',')){

                    count++;
                }
            }
        }
        return count;
    }

    public static int findNumberOfLetterA(String inputString) {
        int count = 0;
        String[] wordArray;

        wordArray = inputString.split(" ");

        //code help from
        //https://stackoverflow.com/questions/40653442/how-to-count-the-number-of-letters-in-an-array-java#:~:text=Just%20iterate%20over%20strings%20and,%7B%20char%5B%5D%20ch%20%3D%20str.
        for (int i = 0; i < wordArray.length; i++) {
            char[] eachLetterAinArray = wordArray[i].toCharArray();
            for (int j = 0; j < eachLetterAinArray.length; j++) {
                if ((eachLetterAinArray[j] == 'a')
                        || (eachLetterAinArray[j]== 'A')){

                    count++;
                }
            }
        }
        return count;
    }

    public static int findNumberOfLetterE( String inputString){

        int count = 0;
        String[] wordArray;

        wordArray = inputString.split(" ");
        //code help from
        //https://stackoverflow.com/questions/40653442/how-to-count-the-number-of-letters-in-an-array-java#:~:text=Just%20iterate%20over%20strings%20and,%7B%20char%5B%5D%20ch%20%3D%20str.
        for (int i = 0; i < wordArray.length; i++) {
            char[] eachLetterEinArray = wordArray[i].toCharArray();
            for (int j = 0; j < eachLetterEinArray.length; j++) {
                if ((eachLetterEinArray[j] == 'e')
                        || (eachLetterEinArray[j]== 'E')){

                    count++;
                }
            }
        }
        return count;
    }

    public static int findNumberOfLetterI( String inputString){

        int count = 0;
        String[] wordArray;
        wordArray = inputString.split(" ");
        //code help from
        //https://stackoverflow.com/questions/40653442/how-to-count-the-number-of-letters-in-an-array-java#:~:text=Just%20iterate%20over%20strings%20and,%7B%20char%5B%5D%20ch%20%3D%20str.
        for (int i = 0; i < wordArray.length; i++) {
            char[] eachLetterIinArray = wordArray[i].toCharArray();
            for (int j = 0; j < eachLetterIinArray.length; j++) {
                if ((eachLetterIinArray[j] == 'i')
                        || (eachLetterIinArray[j]== 'I')){

                    count++;
                }
            }
        }
        return count;
    }

    public static int findNumberOfLetterO( String inputString){

        int count = 0;
        String[] wordArray;

        wordArray = inputString.split(" ");
        //code help from
        //https://stackoverflow.com/questions/40653442/how-to-count-the-number-of-letters-in-an-array-java#:~:text=Just%20iterate%20over%20strings%20and,%7B%20char%5B%5D%20ch%20%3D%20str.
        for (int i = 0; i < wordArray.length; i++) {
            char[] eachLetterOinArray = wordArray[i].toCharArray();
            for (int j = 0; j < eachLetterOinArray.length; j++) {
                if ((eachLetterOinArray[j] == 'o')
                        || (eachLetterOinArray[j]== 'O')){

                    count++;
                }
            }
        }
        return count;
    }

    public static int findNumberOfLetterU( String inputString){

        int count = 0;
        String[] wordArray;

        wordArray = inputString.split(" ");
        //code help from
        //https://stackoverflow.com/questions/40653442/how-to-count-the-number-of-letters-in-an-array-java#:~:text=Just%20iterate%20over%20strings%20and,%7B%20char%5B%5D%20ch%20%3D%20str.
        for (int i = 0; i < wordArray.length; i++) {
            char[] eachLetterUinArray = wordArray[i].toCharArray();
            for (int j = 0; j < eachLetterUinArray.length; j++) {
                if ((eachLetterUinArray[j] == 'u')
                        || (eachLetterUinArray[j]== 'U')){

                    count++;
                }
            }
        }
        return count;
    }


    public static int findNumberOfExclamationPoints(String inputString) {

        String[] wordArray;
        wordArray = inputString.split(" ");
        int count = 0;
        for (int i = 0; i < wordArray.length; i++) {
            char[] eachExclamationPointInArray = wordArray[i].toCharArray();
            for (int j = 0; j < eachExclamationPointInArray.length; j++) {
                if ((eachExclamationPointInArray[j] == '!')){

                    count++;
                }
            }
        }
        return count;
    }

    public static int findNumberOfQuestionMarks(String inputString) {

        String[] wordArray;
        wordArray = inputString.split(" ");
        int count = 0;
        for (int i = 0; i < wordArray.length; i++) {
            char[] eachQuestionMarkInArray = wordArray[i].toCharArray();
            for (int j = 0; j < eachQuestionMarkInArray.length; j++) {
                if ((eachQuestionMarkInArray[j] == '?')){

                    count++;
                }
            }
        }
        return count;
    }

    public static int findNumberOfPeriods(String inputString) {
//
        String[] wordArray;
        wordArray = inputString.split(" ");
        int count = 0;
        for (int i = 0; i < wordArray.length; i++) {
            char[] eachPeriodsInArray = wordArray[i].toCharArray();
            for (int j = 0; j < eachPeriodsInArray.length; j++) {
                if ((eachPeriodsInArray[j] == '.')){

                    count++;
                }
            }
        }
        return count;
    }

    public static int findNumberOfCharacters(String inputString) {

        return inputString.length();
    }

    public static void main(String[] args) {

        //Declare variables
        String inputString = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text to analyze: ");
        inputString = scanner.nextLine();

        int totalA = findNumberOfLetterA(inputString);
        int totalE = findNumberOfLetterE(inputString);
        int totalI = findNumberOfLetterI(inputString);
        int totalO = findNumberOfLetterO(inputString);
        int totalU = findNumberOfLetterU(inputString);

        int totalPeriod = findNumberOfPeriods(inputString);
        int totalComma = findNumberOfCommas(inputString);
        int totalExclamation = findNumberOfExclamationPoints(inputString);
        int totalQuestionMark = findNumberOfQuestionMarks(inputString);

        int numCharacters = findNumberOfCharacters(inputString);
        int numWords = findNumberOfWords(inputString);
        String longestWord = findLongestWord(inputString);
        String shortestWord = findShortestWord(inputString);

        String[] inputStringArray = inputString.split(" ");






        //Print out your findings to the console here
        System.out.println("****Text Analyzer Program***");

        System.out.println("Total [a]: " + totalA);
        System.out.println("Total [e]: " + totalE);
        System.out.println("Total [i]: " + totalI);
        System.out.println("Total [o]: " + totalO);
        System.out.println("Total [u]: " + totalU);
        System.out.println("Total periods: " + totalPeriod);
        System.out.println("Total commas: " + totalComma);
        System.out.println("Total exclamation points: " + totalExclamation);
        System.out.println("Total question marks: " + totalQuestionMark);
        System.out.println("Total characters: " + numCharacters);
        System.out.println("Total words: " + numWords);
        System.out.println("The longest word: " + longestWord);
        System.out.println("The shortest word: " + shortestWord);

    }
}
