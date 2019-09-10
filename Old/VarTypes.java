package armCo.AMarted.RecapNotes;

public class VarTypes {

//      ------  Variables Types  ------

    //String - USE DOUBLE QUOTES
    String myName = "Andrew";
    String lastName = "Martin";

    //Integers - Whole numbers (max value is 2,147,483,648 - 32 bits)
    int myAge = 36;

    //Byte - Very small type (max value 127)
    byte myByte = 127;

    //Short - 2x Byte [or is it squared?]
    short myShort = 128;

    //Long - Very big numbers (max value is 9,223,372,036,854,775,807 - 64 bits) - MUST USE THE "L" AFTER THE NUMBER
    long myLong = 3000000L

    //Float - Decimal {1.34, 3.14,...) - MUST USE THE "f" AFTER THE NUMBER
    float piNum = 3.14f;

    //Double - Bigger than 'Decimal' - Best for currency and math
    double myDouble = 23.89;

    //Char = Character {e.g. &, $, @, ., etc.} - USE SINGLE QUOTES
    char myChar = 'j';

    //Boolean - True or False, 1 or 0
    boolean myBool = false;


    public void main(String[] args) {
        System.out.println("My age is "+ myAge + " (" + myBool + ")");
    }



}
