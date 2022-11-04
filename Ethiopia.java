package org.alphatilesapps.alphatiles;

import java.util.ArrayList;
import java.util.List;

public class Ethiopia extends GameActivity {


    int keysInUse; //Number of keys in the language's total keyboard
    int keyboardScreenNo; //For languages with more than 35 keys,page 1 will have 33 buttons and a forward/backward button

    int totalScreens;
    int partial;

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

    //Change the suers score based on how many times they have guessed.
     //If the number of guesses exceeds the number of answers score goes down


    //Display Images for game

    //Display dashes

    //Display each letter of the answer
        //Create X's based on language
        //With each mistake number of lives goes down by one.


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

    //Screens displays based on when players win and lose
}
