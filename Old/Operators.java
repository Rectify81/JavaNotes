package armCo.AMarted.RecapNotes;

import java.util.Scanner;

//   **** File Comes from Main.java ("public class Main") *****
public class Operators {


/*
    ===== Basic Operators =====
        + : Addition
        - : Subtraction
        * : Multiplication
        / : Division
        % : Remainder

    ===== Relational Operators =====
       == : Equal To
       != : NOT Equal To
        > : Greater Than
        < : Less Than
       >= : Greater Than or Equal To
       <= : Lesser Than or Equal To

    ===== Logical Operators =====
       && : AND == both "sides" need to be TRUE in order for the whole expression to return true
       || : OR (dual-pipes)
        ! : NOT

    ===== Generalities =====
       SYMBOL     NAME      PRIMARY USE
         { }     Braces     Blocks of code, Method Signatures
          ;    Semicolon    Code statements, End of line
         ( )  Parenthesis   Parameters, Calling a method
         [ ]    Brackets    Data objects, Data position
      = ! & +  Operators    Reference assignment and logic

    ===== Logical Operators =====
        camelCase  - used most often, generally for variables and methods [methods are followed with "()"]
        PascalCase - used to define classes
        snake_case - used in xml files (android only)
         ALL CAPS  - SQL language (android only)
*/

    public static void main(String[] args) {
        double firstNum = 10;
        double secondNum = 3;
        double myResult;


        //Basic Operations
        //Addition = "+"
        double myAdd = (firstNum + secondNum);
        //Subtraction = "-"
        double mySub = (firstNum - secondNum);
        // Multiplication = "*"
        double myMulti = (firstNum * secondNum);
        // Division = "/"
        double myDiv = (firstNum / secondNum);
        // Remainder = "%" - what remains (e.g. 4%3=1) - 4 divided by 3 is 1 with a remainder of 1
        double myRem = (firstNum % secondNum);
        System.out.println("Add = " + myAdd +"; Sub = " + mySub + "; Multi = " + myMulti + "; Div = " + myDiv + "; Rem = " + myRem);


        myResult = firstNum % secondNum;  //myResult = the remainder of firstNum DIVIDED by secondNum
        System.out.println(" My remainder is: " + myResult);
        //Could also do the math in the print line: System.out.println("My remainder is: " + (firstNum % secondNum))




    /*
    ===== Relational Statements (IF, FOR, WHILE) =====
    */


        //If Statements
        System.out.println("Multiple IF Statements:");
        boolean isOld = true;
        boolean isYoung = false;

        if (isOld = true) {
            System.out.println(" Old = True");
        } else {
            System.out.println(" Old = False");
        }
        if (isYoung = true) {
            System.out.println(" Young = True");
        } else {
            System.out.println(" Young = False");
        }


        if (firstNum == secondNum) {
            System.out.println("-- Numbers shouldn't be equal! --");
        }



        if ( (isOld && !isYoung) && (firstNum < secondNum) ) {
            System.out.println("   Wow, you found a way to be both young AND old...");
            System.out.println("   Horray, first number is lower!!");
        }else {
            System.out.println("   yup, you can't be both old and young...");
            System.out.println("   Or it could just be the second Number is higher!!");
        }

        //For and While Loops
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
        } while value != 5);
        System.out.println("Got 5!");

        System.out.println("fin");
    }

}
