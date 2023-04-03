package week_9_homework;
/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;

public class Pgrm6RetrieveElementFromArray {
    public static void main(String[] args) {//main method
        elements();//calling static method to main method
    }
    public static void elements() { //declare static method
        ArrayList<Float> list = new ArrayList<Float>();//declare arraylist
        list.add(432.5f);
        list.add(6.4f);
        list.add(806.7f);
        list.add(6.2f);
        list.add(119.6f);

        for (float data : list) {
            System.out.println(data);
        }

        float element = list.get(2);
        System.out.println("element at index 1 :" + element);
        element = list.get(3);
        System.out.println("element at index 4 :" + element);

    }


}
