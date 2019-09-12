package com.armco.amarted;

import java.util.Scanner;

public class IfForWhile {

   //   === IF-STATEMENTS ===
    public static void ifStatement() {
        int score = 6000;
        if (score >= 5000) {
            System.out.println("Your score was above 5000");
        }else if (score < 1000 && score >= 500) {
            System.out.println("Your score was between 500 and 1000");
        } else {
            System.out.println("Your score was < 500");
        }
    }

    //  Don't forget you can also use logical operators (e.g. "and, or, not")
    public static void ifLogicalOperators(){
        int age = 38;
        int sex = 2;
        if ((age > 35 && sex != 0) || ((sex == 2) && ((age >= 18) && (age <= 40)))){
     //              "and" "not"  "or"           "and"           "and"
            System.out.println("It's a match!");
        }


    //    You want to limit the number of return statements, so look at how the first example
    //    is refactored into the second.

    public static int badReturnStatements(){
        int playerScore = 1300;
        if (playerScore >= 100){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore>=100) {
            return 3;
        }   return 4;
    }

    public static int goodReturnStatements(){
        int playerScore = 1300;
        int position = 4;  // assuming position 4 will be returned - if none of the other conditions are met it won't change
        if(playerScore >= 100){
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore>=100) {
            position = 3;
        }
        return position;  // Now there is only one "return" call
    }


   //   === TERNARY OPERATIONS - EXPRESS IF-STATEMENTS ===
    int ageOfClient = 20;
    boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
/*    <variableToBeAssigned> = <condition> ? <valueIfTrue> : <valueIfFalse>;

    The ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition.
    Essentially, it's a shortcut of the if-then-else statement
 */



   //   === 'FOR'-'WHILE'-'DO' LOOPS ===

    // For Loop
        System.out.println("For Loop:");

        for (int i = 1; i <= 40; i++) {

        if ( i % 4 == 0) {
            System.out.println(" " + i + " is a multiple of 4");
        }
    }

    // While Loop
        System.out.println("While Loop:");
    int p = 1;
        while (p < 6) {
        System.out.println(" Counting... " + p);
        p++;
    }

    //Do While Loop - I believe the "While Loop" now takes care of this
    Scanner scanner = new Scanner(System.in);
    int value;
    //above lines just set some stuff up so that the following doesn't show errors
        do {
        System.out.println("Enter a number: ");
        value = scanner.nextInt();
    } while (value != 5);
        System.out.println("Got 5!");

        System.out.println("fin");
}

}
