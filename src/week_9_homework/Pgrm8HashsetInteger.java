package week_9_homework;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Pgrm8HashsetInteger {
    public static void main(String[] args) {
        Pgrm8HashsetInteger obj = new Pgrm8HashsetInteger();
        obj.addElements();
    }


    HashSet<Integer> set = new HashSet<>();

    public void addElements() {
        set.add(8);
        set.add(14);
        set.add(16);
        set.add(4);
        set.add(235);
        set.add(7);
        set.add(13);
        set.add(41);
        for (int i : set) {
            if (i > 0 && i < 10) {
                System.out.println("No. " + i + " is in the Set.");
            }
        }

    }
}