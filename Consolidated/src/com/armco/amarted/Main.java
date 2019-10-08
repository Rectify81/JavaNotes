package com.armco.amarted;

import com.armco.amarted.notes.ClassesMethods.Constructors.VipCustomer;
import com.armco.amarted.notes.Inheritance.InheritanceMain;

public class Main {

    public static void main(String[] args) {
/*
 *                *** GENERAL NOTES ***
 *  public static void main(String[] args) {}
 *     1     2     3    4      5      6     7
 *
 *   1) Access Permissions(public, private, or Protected) - See Ball.java
 *   2)
 *   3) Return Type (void= no return; examples: String, Char, Boolean - any variable type)
 *   4) Name (user determines the name of the class or method)
 *   5) Declaration of Variables (e.g. String firstName, boolean iTerm, etc)
 *   6) Values to Pass On (e.g. a:4 b:5)
 *   7) Code Block - where your code goes
 *   *** SEE MethodBasics FOR MORE EXAMPLES ***
 *
 *   Classes - Blueprint of objects (need properties - see Ball.java)
 *   Methods - Enclosed statements that perform an operation (generally return a value)
 */

/*      When using an IDE (IntelliJ or AndroidStudio), they will usually suggest which variable you are calling as
        you type.  They will denote the name with the following:
        p = Parameter
        f = Field (variable)
        m = Method
        c = Class
        i = ???
        lighteningBolt = ???

        If it has a lock next to it, it is showing if it is "private" (locked) or "public" (unlocked)
 */


//      ***  DECIDE WHAT TO OUTPUT HERE  ***
        System.out.println();
        //  ^---- keep above line for formatting purposes



//        VariableTypes.displayVariableInfo();
//        MemoryAllocation.decimalExamples();
//        Homework.lbsToKilos();
//        Homework.operatorChallenge();
//        Homework.scoreChallenge();
//        int position = Homework.calculateHighScorePosition(1500);
//        Homework.displayHighScorePosition("Andrew", position);
//        position = Homework.calculateHighScorePosition(900);
//        Homework.displayHighScorePosition("Billy", position);
//        position = Homework.calculateHighScorePosition(400);
//        Homework.displayHighScorePosition("Chris", position);
//        position = Homework.calculateHighScorePosition(50);
//        Homework.displayHighScorePosition("Nikki", position);
//        System.out.println(Homework.calcFeetAndInchesToCentimeters(8));
//        System.out.println(Homework.calcFeetAndInchesToCentimeters(7,5));
//        System.out.println(Homework.getDurationString(420,42));
//        System.out.println(Homework.getDurationString(-3945));
//        Homework.printSwitchStatement('B');
//        Homework.printDayOfTheWeek(2);
//        Homework.printInterest(10000);
//        Homework.print3and5();
//        IfForWhile.doLoop();
//        Homework.printEvenNumbers(4,20);
//        IfForWhile.whileContinue(4,20);
//        Homework.testEven(4,20);
//        System.out.println(Homework.sumDigits(125));
//        System.out.println(Homework.sumDigits(-125));
//        System.out.println(Homework.sumDigits(4));
//        System.out.println(Homework.sumDigits(32123));
//        ParsingValues.parseStringToNumber(2018);
//        UserInput.readingUserInput();
//        Homework.mySumTenNumbers();
//        Homework.instructorSumTenNumbers();
//        Homework.printMinAndMax();
//        CarMain.callCarMain();

//        // Creating and using constructors with the BankAccount.java
//        System.out.println("USING BLANK CONSTRUCTOR");
//        BankAccount lindasAccount = new BankAccount();
//        System.out.println(lindasAccount.getPhone());
//        System.out.println(lindasAccount.getBalance());
//        System.out.println("\nUSING CONSTRUCTOR WITH PARAMETERS");
//        BankAccount bobsAccount = new BankAccount(12345,0.0,"Bob Brown","bobbyBrown@gmail.com","857-555-2020");
//        bobsAccount.withdrawFunds(100.00);  // <--Balance is 0, so insufficient funds
//        bobsAccount.depositFunds(250.00);
//        bobsAccount.withdrawFunds(100.00);
//        System.out.println(bobsAccount.getAccountNum());
//        System.out.println(bobsAccount.getEmail());

//        // USE VipCustomer TO DEMONSTRATE CONSTRUCTORS
//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getName());
//        System.out.println(person1.getCreditLimit());
//        VipCustomer person2 = new VipCustomer("Beth","beth@email.com");
//        System.out.println(person2.getName());
//        System.out.println(person2.getCreditLimit());
//        VipCustomer person3 = new VipCustomer("Tim",250000.0,"tim@gmail.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getCreditLimit());

        InheritanceMain.callMain();




    }
}
