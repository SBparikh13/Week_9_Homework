package week_9_homework;
/**Write a Java program to iterate through all elements in an array list using
        Iterater.*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pgrm5Iterator {
    public static void main(String[] args) {
        iterateElements();

    }

    public static void iterateElements() {//static method
        // using hashset logic//
        Set<String> fruitName = new HashSet<String>();//iterator
        fruitName.add("Watermelon");
        fruitName.add("Pineapple");
        fruitName.add("Peach");
        fruitName.add("Orange");
        fruitName.add("Mango");
        Iterator fruit = fruitName.iterator();
        while (fruit.hasNext()) {
            System.out.println(fruit.next());
        }
    }
}