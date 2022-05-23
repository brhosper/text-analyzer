package com.kenzie.app;

import java.util.Scanner;

public class Main {

    public static String findLongestWord(String inputString) {

        String longestWord;
        String[] wordArray;

        // code help from
        // https://www.delftstack.com/howto/java/how-to-remove-punctuation-from-string-in-java/#:~:text=Remove%20Punctuation%20From%20String%20Using,means%20all%20the%20punctuation%20symbols.
        //wordArray = inputString.replaceAll("\\p{Punct}", "").split(" ");
        wordArray =  inputString.replaceAll("[.,!?]", "").split(" ");
        //[^-]
        //wordArray.replaceAll("\\p{Punt}", "");
        longestWord = wordArray[0];
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > longestWord.length()) {
                longestWord = wordArray[i];
            }
        }

        return longestWord;
    }

    public static String findShortestWord(String inputString) {

        //https://stackoverflow.com/questions/25829866/finding-the-shortest-word-in-an-array-of-strings-java
        String[] wordArray = new String[0];

        // code help from
        // https://www.delftstack.com/howto/java/how-to-remove-punctuation-from-string-in-java/#:~:text=Remove%20Punctuation%20From%20String%20Using,means%20all%20the%20punctuation%20symbols.
        wordArray = inputString.replaceAll("\\p{Punct}", "").split(" ");
        //wordArray =  inputString.replaceAll(".*[.,!?].*", "").split(" ");

//        int index = 0;
//        int minLength = wordArray[0].length();
//        for (int i = 0; i < wordArray.length; i++) {
//
//            //From Nathan during study Hall
//            //if ((wordArray.length) == 1 && wordArray[0].equals("")){
//            //return 0;
//
//            if (wordArray[i].length() < minLength)
//                index = i;
//            minLength = wordArray[i].length();
//        }
        String shortestWord;
        shortestWord = wordArray[0];

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() < shortestWord.length()) {
                shortestWord = wordArray[i];
                if (wordArray.length == 1 && wordArray[0].equals(""));
                break;
            }
//            if ((wordArray.length) == 1 && wordArray[0].equals("")) {
//                return "";
            }


            //return wordArray[index];
            return shortestWord;
        }


    public static int findNumberOfWords(String inputString) {
        int count = 0;
        String[] wordArray = new String[0];
        wordArray = inputString.replaceAll("[,.?!]", "").split(" ");

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].isEmpty()) {

            } else
                count++;
        }
        return count;
    }


    public static int findNumberOfCommas(String inputString) {

//        int count = 0;
//        String[] wordArray;
//        // wordArray = inputString.split(" ");
//        // help from https://regexone.com/
//        wordArray = inputString.replaceAll("[a-z A-Z!?.\\d]", "").split(" ");
//
//
//        for (int i = 0; i < wordArray.length; i++) {
//            for (int j = 0; j < wordArray[i].length(); j++) {
//
//            }
//            if (wordArray[i].contains(",")) {
//                count++;
//            }
//
//        }
//        return count;
//
//    }

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
        // help from https://regexone.com/
        // wordArray =
        //inputString.replaceAll("[b-z B-Z!?.\\d]", "").split(" ");
        //inputString.codePointCount(0, inputString.length());
//        char[] charArray = '';
//        inputString.getChars(0, inputString.length(), charArray);
        //inputString.codePointBefore(0, inputString.length());


//        for (int i = 0; i < inputString.length(); i++) {
//
//        }
//         if (inputString.matches("[a++]"));
//         count++;


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

//            String letters = new String(wordArray[count]);
//        }
//


            //char[] eachLetterAInArray = wordArray[i].toCharArray();

//            //if (wordArray[i].contains("a")) {
//            for (int j = 0; j < eachLetterAInArray.length; j++) {
//                if (eachLetterAInArray[j] == 'a' | eachLetterAInArray[j] 'A'){
//                    // if (wordArray[j].matches("[a+]")) {
//                    count++;
//                }
//
//            }
//        }
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

//            if (wordArray[i].equals('a'){
//                count++;


//        if(letter.equals("a")) {
//            letterVariableCountA++;
//        }

//







    public static int findNumberOfExclamationPoints(String inputString) {
//        int count = 0;
//        String[] wordArray;
//        wordArray = inputString.split(" ");
//
//        for (int i = 0; i < wordArray.length; i++) {
//            if (wordArray[i].contains("!")) {
//                count++;
//            }
//
//        }
//        return count;
//    }
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
//        int count = 0;
//        String[] wordArray;
//        wordArray = inputString.split(" ");
//
//        for (int i = 0; i < wordArray.length; i++) {
//            if (wordArray[i].contains("?"))
//                count++;
//        }
//        return count;
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

//        int total = 0;
//        int count = 0;
//        String[] wordArray;
//        wordArray = inputString.split(" ");
//
//        for (int i = 0; i < wordArray.length; i++) {
//            if (wordArray[i].isEmpty()) {
//
//            } else
//                count = wordArray[i].length();
//                total = total + count;
//
//
//        }
        //from helping another student during class
        return inputString.length();
    }



    // In this assessment, you will be evaluated on how well you organize your code into methods
    // as well as how well you develop methods in order to achieve the requirements. 
    
    //Suggested Methods: 
    // Create a countCharacter() method
    // to count how many times a specific character appears in a string
    // Characters can be letters or punctuation
    // Hint: This can be done by taking in the character as a char or as a String
    // - vowels, punctuation
    //Hint: return an int


    //Create a method that counts the number of characters in a string

    //Create a method to count the number of words in a string

    //Create a method to find the longest word in a string

    //Create a method to find the shortest word in a string




    public static void main(String[] args) {

        //String inputString = "Hello! Welcome to Kenzie.  My name is Robert, and I'm here with my friend Waldo.  Have you met waldo?";
        //String inputString = "Hello! there now now test..,, A aa aa a ?!  ???";

        //Declare variables
        String inputString = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a sentence");
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


//
        //

        //find shortest word variables

        //shortestWord = longestWord;

        //find shortest word loop


        //Call your methods here in main()   


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
        //System.out.println("Total punctuation: " + totp);
        System.out.println("Total characters: " + numCharacters);
        System.out.println("Total words: " + numWords);
        System.out.println("The longest word: " + longestWord);
        System.out.println("The shortest word: " + shortestWord);








    }
}
