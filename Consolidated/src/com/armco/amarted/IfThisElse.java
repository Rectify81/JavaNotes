package com.armco.amarted;

public class IfThisElse {


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
}
