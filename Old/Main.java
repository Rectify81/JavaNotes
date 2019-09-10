package armCo.AMarted.RecapNotes;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cruncher Andrew = new Cruncher();
        Andrew.setUiName("Andrew");
        Andrew.setUiAge(37);
        Andrew.setUiRetAge(58);
        Andrew.setUiDeath(82);
        Andrew.setUiSalary(50000);
        Andrew.setUiInflation(.5);

        Andrew.showDetails();

     // Find the online class here: https://www.udemy.com/complete-android-developer-course/learn/v4/t/lecture/7587198?start=0

    }
}


/*             *** GENERAL NOTES ***
public static void main(String[] args)
   1     2     3    4      5      6

1) Access Permissions(public, private, or Protected) - See Ball.java
2)
3) Return Type (void= no return; examples: String, Char, Boolean - any variable type)
4) Name (user determines the name of the class or method)
5) Declaration of Variables (e.g. String firstName, boolean iTerm, etc)
6) Values to Pass On (e.g. a:4 b:5)
*** SEE MethodBasics FOR MORE EXAMPLES ***


Classes - Blueprint of objects (need properties - see Ball.java)
Methods - Enclosed statements that perform an operation (generally return a value)
 */