package armCo.AMarted.RecapNotes;

//   **** File Comes from Main.java ("public class Main") *****
public class MethodBasics {

    // Methods are enclosed statements that perform an operation - found within classes


/*
    public static void myName() {
    public static [return type] [name]([variables])
    (int, string)
 */



        public static void main(String[] args) {
            // write your code here

            myStart( "remove");
            int finalResult = addNums(4, 5) + 10;

            System.out.println(myPatient("Patient 007"));
            System.out.println(fullName("George","Parker"));
            System.out.println("is " + finalResult + " years old.");
            System.out.println(showChar('$'));
            System.out.println("Is Terminal: " + isTerminal(true));
            System.out.println("Years Left: " + timeLeft(1.24f));
            System.out.println("Mutation Probability: " + mutantIndex(3.14236));
        }


        //Methods
        public static String myPatient(String mPatient) {
            return mPatient;
        }

        public static void myStart(String mName) {

            System.out.println(mName);
        }


        //Return an Integer
        public static int addNums (int a, int b) {
            //System.out.println("Sum = " + (a + b));

            //return (a+b);  <--Works the same as below:
            int result = 0;
            result = a + b;
            return result;
        }

        //Return a String
        public static String fullName(String firstName,String lastName){
            return firstName + " " + lastName;
        }

        //Return a Character
        public static char showChar(char c){
            return c;
        }

        //Return a Boolean
        public static boolean isTerminal(boolean iTerm){
            return iTerm;
        }
        //Return a Float
        public static float timeLeft(float tLeft){
            return tLeft;
        }

        //Return a Double
        public static double mutantIndex(double mIndex){
            return mIndex;
        }

        //"Void" = Simply means the 'method' will not be returning any value


    //  --- IN A NUTSHELL ---

    /* Classes can contain:
        1. Data
        2 Subroutines (methods) - Behavior...

        Instance variables = data or "state"

        variables are called directly
            person2.name = "Joe Bloggs";
            person2.age = 37
        methods always require '()'
            person2.speak();   <---This would run everything in the 'method' "speak" - perhaps: System.out.println("My name is " + name + ", and I am " + age + " years old.");
            person2.getOlder();   <---in this 'method' you could put: age = age + 10

            My name is Joe Bloggs and I am 37 years old.
            [unseen, Joe would then become 47 years old because of the "getOlder" method adding 10 to his age
    */
    }
