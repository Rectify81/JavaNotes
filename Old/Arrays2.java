package armCo.AMarted.RecapNotes;

import java.util.ArrayList;

public class Arrays2 {


//ARRAY LISTS - SEE MORE BY SEARCHING 'JAVA CLASS LIBRARY' (java.util -> ArrayList)
    //ArrayList<String> animals = new ArrayList(); <---Predetermines that the array will be a String
    ArrayList animals = new ArrayList();
    animals.add("Pig");
    animals.add("Cow");
    animals.add("Parrot");

    //How to get items to print ou
            System.out.println(animals.get(0)); // output == Pig
            System.out.println(animals.get(1)); // output == Cow

    //We can also remove and do all sort of things with ArrayLists
             animals.remove(0); //removes the first item in our array list

    //we can add items on the fly
             animals.add(0, "Dog"); //add Dog on index 0

    //We can remove by calling the object name
             animals.remove("Cow"); //will remove "Cow" <-Select "Object"

    //Find the size of the arraylist
             animals.size();

    //How to iterate through our arrayList

             //use "contains()" method to do some checking logic
             if (animals.contains("Cow")) {

                     	 //Do something here!

                                     }

            for (int i=0; i<animals.size(); i++ ) {
            	System.out.println("Animals:" +animals.get(i)); // get all animals in our arraylist

                    }

            //Enhanced for-loop - Better than above
            for(Object animal : animals) {
                 System.out.println("Animals:" +animal; // get all animals in our arraylist
            }
}