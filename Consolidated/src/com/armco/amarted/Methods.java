package com.armco.amarted;

public class Methods {

    // Methods are enclosed statements that perform an operation - found within classes

/*       === Usage ===
    public static void myName() {
    public static [return type] [name]([variables])
                  (int, string)
 */

//       === Basic Method ===
    public static void calculateScore(){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (gameOver){
            int finalScore = score + (levelCompleted *bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }
//      calculateScore2();  <--- Example of how it's called


//       === Passing Arguments ===
    public static void calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }
//      calculateScore2(true, 800, 5, 100);  <--- Example of how it's called
//      calculateScore2(var1, var2, var3, var4);  <-- can use variables of same type or literal values


//       === Returning Arguments ===
    public static int calculateScore3(boolean isGameOver, int lastScore, int highestLevelCompleted, int bonus){
        if (isGameOver){
            int finalScore = lastScore + (highestLevelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
//      calculateScore3(true, 800, 5, 100);  <--- Example of how it's called
//      int newHighScore = calculateScore3(true, 800, 5, 100);    <-- Variables can be assigned the return value

}
