package week_9_homework;

import java.util.ArrayList;

/** Write a Java program to test if an array list is empty or not.
import java.util.ArrayList;*/

public class Pgrm7ArrayEmptyOrNot {

    public static void main(String[] args) {//main method
        countryName();

    }
    public static void countryName(){//static method
        ArrayList<String> country = new ArrayList<>();
        country.add("India");
        country.add("England");
        country.add("America");
        country.add("Australia");
        country.add("New zealand");
        country.add("Japan");

        System.out.println("ArrayList of Country Name ");
        //for each loop//
        for(String tube    : country){//for each loop
            System.out.println(tube + " ");
        }
        if( country.isEmpty()){
            System.out.println( "This arraylist is empty " );

        }else{
            System.out.println( "This arraylist is not empty");
        }


    }
}

