package week_9_homework;

import java.util.Scanner;

/**
 Rewrite the student mark sheet programme (From java-homework-week3
 programmes) using if else and while loop.*/

public class Pgrm2StudentMarkSheet {

    public static void main(String[] args) {
        Pgrm2StudentMarkSheet obj = new Pgrm2StudentMarkSheet();
        obj.markSheet();

    }
    static String result;
    static String grade;
    public void markSheet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name  : ");
        String name = sc.nextLine();
        System.out.println("Enter student roll number : ");
        int rollnum = sc.nextInt();
        System.out.println("Enter Maths Marks: ");
        int mathmarks = sc.nextInt();
        while(mathmarks<0||mathmarks>=100) {
            System.out.println("Invalid input. ");
            System.out.println("Please enter correct marks :");
            mathmarks = sc.nextInt();

        }
        System.out.println("Enter English Marks :");
        int engmarks = sc.nextInt();
        while(engmarks<0||engmarks>= 100) {
            System.out.println("Invalid input.");
            System.out.println("Please enter correct marks :");
            engmarks = sc.nextInt();
        }
        System.out.println("Enter Science Marks :");
        int scimarks = sc.nextInt();
        while (scimarks<0||scimarks>=100) {
            System.out.println("Invalid input");
            System.out.println("Please enter correct marks :");
            scimarks = sc.nextInt();
        }
        int total = mathmarks + engmarks + scimarks;
        System.out.println(" Total Marks : " + total);
        int percentage = ((total*100)/300);
        System.out.println("Percentage  : " + percentage);

        if(percentage>=35&&percentage<=50){
            result = "Pass";
            grade = "Grade C";
        }else if(percentage>=50&&percentage<=60){
            result = "Pass";
            grade = "Grade B";
        }else if(percentage>=60&&percentage<=80){
            result = "Pass";
            grade = "Grade A";
        }else if(percentage>=80&&percentage<=100){
            result = "Pass";
            grade = "Grade A+";
        } else{
            result= "Fail";
            grade = "Grade D ";
        }sc.close();

        System.out.println("-----------------------------------");
        System.out.println("|       Mark Sheet                |");
        System.out.println("|_________________________________|");
        System.out.println("|   Name      :       " +name+   "|");
        System.out.println("|   Roll No   :       "+rollnum+ "|");
        System.out.println("|_________________________________|");
        System.out.println("|   Subjects  :          Marks    |");
        System.out.println("|_________________________________|");
        System.out.println("|   Math      :      "+mathmarks+"|");
        System.out.println("|   Science   :       "+scimarks+"|");
        System.out.println("|   English   :       "+engmarks+"|");
        System.out.println("|_________________________________|");
        System.out.println("|   Total     :          "+total+"|");
        System.out.println("|_________________________________|");
        System.out.println("|   Percentage:     "+percentage+"%"+"|");
        System.out.println("|   Result    :     "  +result  +      "|");
        System.out.println("|   Grade     :      "+  grade +        "|");
        System.out.println("|_________________________________|");



    }



}
