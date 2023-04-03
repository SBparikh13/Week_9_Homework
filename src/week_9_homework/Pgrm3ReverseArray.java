package week_9_homework;
/**Write a Java program to reverse an array of integer values*/
public class Pgrm3ReverseArray {
    public static void main(String[] args) {
     reverseArrayMethod();
    }
    public static void reverseArrayMethod(){
        int [] a =new int[ ]{1,2,3,4,5,6,7};//initialising an array

        for(int i =0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        for(int i=a.length-1;i>=0;i--){//reverse loop

            System.out.println(a[i]+ " ");
        }

    }
}
