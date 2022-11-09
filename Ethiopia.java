package org.alphatilesapps.alphatiles;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class Ethiopia extends GameActivity {


    //Keep track of keys
    Set<String> keys = new HashSet<String>();

    int ethiopiaPoints;

    String initial = "";
    String lastWord = "";

    static List<String> keysList = new ArrayList<>();
    static List<String> keysClicked = new ArrayList<>(); // will be used to keep track of the order
    // that the user clicked keys so that we can backtrack in deleteLastKeyedSyllable, and used in evaluateStatus for orange color

    //Array for keyboard
    protected static final int[] TILE_BUTTONS = {
            R.id.key01, R.id.key02, R.id.key03, R.id.key04, R.id.key05, R.id.key06, R.id.key07, R.id.key08, R.id.key09, R.id.key10,
            R.id.key11, R.id.key12, R.id.key13, R.id.key14, R.id.key15, R.id.key16, R.id.key17, R.id.key18, R.id.key19, R.id.key20,
            R.id.key21, R.id.key22, R.id.key23, R.id.key24, R.id.key25, R.id.key26, R.id.key27, R.id.key28, R.id.key29, R.id.key30,
            R.id.key31, R.id.key32, R.id.key33, R.id.key34, R.id.key35
    };

    //Check if users input is within answer
    public static boolean containsLetter(char letter, String answer){


        return false;
    }

    //Change the users score based on how many times they have guessed.
     //If the number of guesses exceeds the number of answers score goes down


    //Display Images for game
    public void displayImages(){


    }


    //Display dashes
    public void displayDashes(String word){

        //Based on the length of the word create dashes to appear on the screen
        int numberOfDashes = word.length();

    }

    //Display each letter of the answer
    public void displayLetters() {


        //With each mistake number of lives goes down by one.

    }

    //Create X's based on language
    public void createLifeDisplay (){

    }

    //Keyboard
    @Override
    protected int[] getTileButtons() {
        return TILE_BUTTONS;
    }

    @Override
    protected int[] getWordImages() {
        return new int[0];
    }

    @Override
    protected int getAudioInstructionsResID() {
        return 0;
    }

    @Override
    protected void centerGamesHomeImage() {

    }

    public static final Logger LOGGER = Logger.getLogger(Ethiopia.class.getName());

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        context = this;

        int gameID = 0;

        if(syllableGame.equals("S")){
            setContentView(R.layout.ethiopia);
        }
    }

    //Load Keyboard
    public void loadKeyboard(){
        if (!keys.isEmpty()){
            keys.clear();
        }
        if (!keysList.isEmpty()){
            keysList.clear();
        }
    }


    //Screens displays based on when players win and lose


}
