package com.Bruk;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // Dictionary
    public static final String[] WORDS = {
            "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE",
            "CASE", "CATCH", "CHAR", "CLASS", "CONST",
            "CONTINUE", "DEFAULT", "DOUBLE", "DO", "ELSE",
            "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY",
            "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS",
            "IMPORT", "INSTANCEOF", "INT", "INTERFACE",
            "LONG", "NATIVE", "NEW", "NULL", "PACKAGE",
            "PRIVATE", "PROTECTED", "PUBLIC", "RETURN",
            "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH",
            "SYNCHRONIZED", "THIS", "THROW", "THROWS",
            "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE"
    };


    public static final Random RANDOM = new Random();

    //Maximum number of mistakes before user loses
    public static final int MAX_ERRORS = 8;

    //Word to solve
    public static String wordToSolve;

    public static char [] lettersFound;
    public static int numberOfErrors;

    //Letters already selected by user
    public static ArrayList<String> letters = new ArrayList<>();

    //Find next word to solve
    public String nextWordToFind() { return  WORDS[RANDOM.nextInt(WORDS.length)];}

    //Start a new Game
    public void newGame(){
        numberOfErrors = 0;
        letters.clear();
        wordToSolve = nextWordToFind();

        //Initialize word found
        lettersFound = new char[wordToSolve.length()];


        for (int i = 0; i <wordToSolve.length(); i++) {
            lettersFound[i] = '_';
        }
    }

    //Check if the word is found by the user
    public static boolean wordFound () {
        return wordToSolve.contentEquals(new String(lettersFound));
    }

    //Method update
    private void changeWord(String currentLetter){

        //If letter is not in word update word
        if (!letters.contains(currentLetter)){

            //Check the answer to see if it contains letter
            if (wordToSolve.contains(currentLetter)){

                //If so, replace _ with current letter
                int index = wordToSolve.indexOf(currentLetter);

                while (index >= 0){
                    lettersFound[index] = currentLetter.charAt(0);
                    index = wordToSolve.indexOf(currentLetter, index+1);
                }
            } else {
                // current character is not in the word
                numberOfErrors++;
            }
            //Add current letter to guessed letters
            letters.add(currentLetter);
        }
    }

    //Method that shows how much of the word has been guessed
    public static  String amountOfWordFound(){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < lettersFound.length; i++) {
            builder.append(lettersFound[i]);

            if (i< lettersFound.length-1){
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    //Launch Game
    public void playGame (){
        try(Scanner input = new Scanner(System.in)){
            //Until number of errors is less than maximum number allowed, let the game run
            while(numberOfErrors < MAX_ERRORS){
                System.out.println("\nGuess a letter: ");
                String let = input.next();

                //Separate and keep the first letter
                if(let.length()>1) {
                    let = let.substring(0, 1);
                }

                //Update word
                changeWord(let);

                //Display current letters guesses correctly
                System.out.println("\n" + amountOfWordFound());

                //Display current word
                if (wordFound()){
                    System.out.println("\nYou Won!");
                    break;
                } else {
                    //Display number of tries remaining
                    System.out.println("Number of lives left: " + (MAX_ERRORS - numberOfErrors));
                }
            }

            //If user loses all their lives
            if(numberOfErrors == MAX_ERRORS){
                //User has lost
                System.out.println("You Lost!");
                System.out.println("Correct Answer: " + wordToSolve);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Ethiopia!");
        Main Ethiopia = new Main();
        Ethiopia.newGame();
        Ethiopia.playGame();
    }


}
