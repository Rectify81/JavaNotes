package com.amarted;

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
    double myPounds = 200d;
    double multiplier = .45359237d;
    double myKilos = myPounds * multiplier;
    //System.out.println(myKilos);

    // OPERATOR CHALLENGE
//    double first = 20.00d;
//    double second = 80.00d;
//    double finalVar = (first + second) * 100.00d;
//        System.out.println("finalVar: " + finalVar);
//    double remainderVar = finalVar % 40.00;
//        System.out.println("remainderVar: " + remainderVar);
//    boolean isNoRemainder = (remainderVar == 0) ? true : false;
//        System.out.println("isNoRemainder value: " + isNoRemainder);
//        if (!isNoRemainder) {
//        System.out.println("Got some remainder");
//    } else {
//        System.out.println("No remainder present...");
//    }

}
