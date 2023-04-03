package week_9_homework;
/** Declare following two arrylist and compare it.
 ArrayList<String> c1= new ArrayList<String>();
 c1.add("Red");
 c1.add("Green");
 c1.add("Black");
 c1.add("White");
 c1.add("Pink");
 ArrayList<String> c2= new ArrayList<String>();
 c2.add("Red");
 c2.add("Green");
 c2.add("Black");
 c2.add("Pink");*/
import java.util.ArrayList;

public class Pgrm11ArrayListAndCompare {


    public static void main(String[] args) {
        // Array lists
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        System.out.println(" ArrayList2 = " + c2);
        System.out.println(" ArrayList1 = " + c1);

        // comparison
        if (c1.equals(c2)==true) {
            System.out.println("The two ArrayLists are equal");
        } else {
            System.out.println("The two ArrayLists are not equal");
        }
    }
}