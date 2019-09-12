package com.armco.amarted;

public class Homework {

    //TODO: Convert these all to methods

    // RE-CREATE AN EXPRESSION IN "LONG" FORMAT
    byte hwByte = 43;
    short hwShort = 4_937;
    int hwInt = 216_569;
    long hwFinalResult = 50000L + (10L * (hwByte + hwShort + hwInt));

    // CAST THE FLOAT VALUE OF 5.25 - MAKE IT ACCEPT IT: FIRST LINE IS BAD, SECOND IS CORRECT
    //float myFloatValueBAD = 5.25;   //<---Incorrect (uncomment to demonstrate)
    float myFloatValue = (float) 5.25;

    // CONVERT POUNDS TO KILOGRAMS
    public static void lbsToKilos() {
        System.out.println("Results from Pounds to Kilos Challenge");
        double myPounds = 200d;
        double multiplier = .45359237d;
        double myKilos = myPounds * multiplier;
        System.out.println("Covert " + myPounds + "lbs to kilograms");
        System.out.println("Kilos: " + myKilos + "\n");
    }

    // OPERATOR CHALLENGE
    public static void operatorChallenge() {
        System.out.println("Results from Operator Challenge");
        double first = 20.00d;
        double second = 80.00d;
        double finalVar = (first + second) * 100.00d;
        System.out.println("finalVar: " + finalVar);
        double remainderVar = finalVar % 40.00;
        System.out.println("remainderVar: " + remainderVar);
        boolean isNoRemainder = (remainderVar == 0) ? true : false;
        System.out.println("isNoRemainder value: " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder\n");
        } else {
            System.out.println("No remainder present...\n");
        }
    }

    //  METHOD CHALLENGES
    public static void scoreChallenge(){
        boolean isGameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(isGameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void displayHighScorePosition (String userName, int position){
        System.out.println(userName + " managed to get into position " + position + " on the High Score Table");
    }
    public static int calculateHighScorePosition(int score){
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
//
//        int position = Homework.calculateHighScorePosition(1500);
//        Homework.displayHighScorePosition("Andrew", position);

}
