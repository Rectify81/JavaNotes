package com.amarted;

public class PrimativeVariables {

    //numerical types  (you can use underscore as place separator: 3_483_864)
    boolean maxBool = Boolean.TRUE;
    boolean minBool = Boolean.FALSE;
    byte sizeBool = 1;
    boolean valueBool = Boolean.FALSE;
    String exBool = "TRUE  -or-  1/0";

    byte maxByte = Byte.MAX_VALUE;
    byte minByte = Byte.MIN_VALUE;
    byte sizeByte = 8;
    byte valueByte = 116;
    String exByte = "???";

    short maxShort = Short.MAX_VALUE;
    short minShort = Short.MIN_VALUE;
    byte sizeShort = 16;
    short valueShort = 4833;
    String exShort = "???";

    int maxInt = Integer.MAX_VALUE;
    int minInt = Integer.MIN_VALUE;
    byte sizeInt = 32;
    String  exInt = "";

    long maxLong = Long.MAX_VALUE;
    long minLong = Long.MIN_VALUE;
    byte sizeLong = 64;
    String exLong = "100L";

    float maxFloat = Float.MAX_VALUE;
    float minFloat = Float.MIN_VALUE;
    byte sizeFloat = 32;
    String exFloat = "2.1656974625891f";

    double maxDouble = Double.MAX_VALUE;
    double minValue = Double.MIN_VALUE;
    byte sizeDouble = 64;
    String exDouble = "1.59763645216853214886542345d";

    // non-numerical types
    byte sizeChar = 0;
    String exChar = "$";

    byte sizeString = 0;
    String exString = "This is an example of a String...";


    /* CASTING
     *   Java by default uses integers and doubles (whole numbers and decimals), so if you are using "literal values"
     *   you must tell the system that you are certain that the result will be of that type.  That is when casting
     *   comes into play.  In the examples below, the number '2' in the expression is treated as an integer by default,
     *   so you use Casting (by putting the type in parentheses before the expression) to alert the compiler that
     *   the integer will be converted into that type by the end of the expression.
     */
    byte myNewByteValue = (byte)(minByte/2);
    short myNewShortValue = (short)(maxShort/2);


    /*
     * TODO: make methods that call these functions
     *
     *
    public static void decimalExamples(){
        int myIntValue = 9 / 4;
        float myFloatValue = 9f / 4f;
        double myDoubleValue = 9d / 4d;
        System.out.println("Integer Value: " + myIntValue);
        System.out.println("Float Value: " + myFloatValue);
        System.out.println("Double Value: " + myDoubleValue);
    }
     *
     */

    public static String showVariableValues(){
        //StringBuilder variableValues = new StringBuilder(){};
        //System.out.println(variableValues);
        return null;
    }





}
