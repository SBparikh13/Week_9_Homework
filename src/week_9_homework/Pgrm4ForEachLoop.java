package week_9_homework;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Pgrm4ForEachLoop {
    public static void main(String[] args) {
        Pgrm4ForEachLoop obj = new Pgrm4ForEachLoop();
        obj.colourName();
    }
    public void colourName() {//instance method
        ArrayList<String> colourList = new ArrayList();
        colourList.add("Sky blue");
        colourList.add("Purple");
        colourList.add("Pink");
        colourList.add("Brown");
        colourList.add("Green");
        for (String colour : colourList) { //using for each loop
            System.out.println(colour);

        }

    }
}