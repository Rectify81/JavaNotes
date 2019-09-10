package armCo.AMarted.RecapNotes;

public class Memory {

    public void myMemory(){

        /* Binary Lesson
              0 = 0000 0000
              1 = 0000 0001
              2 = 0000 0010
              3 = 0000 0011
         */

        byte myByte = 0; // 0000 0000  <- 8bits (eight switches, set to off)
        short myShort = 0; // 0000 0000 0000 0000  <- 16 bits
        int myInt = 0; // 0000 0000 0000 0000 0000 0000 0000 0000  <- 32 bits
        long myLong = 0; // // 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000  <- 64 bits
        float myFloat = 0.0f; // 32bits
        double myDouble = 0; // 64bits
        char myChar = '\u0000'; // 16bits (uni-code for a symbol or letter
        boolean myBoolean = false; // 0  <-1 bit
    }
}
