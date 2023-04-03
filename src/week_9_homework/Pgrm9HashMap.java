package week_9_homework;

import java.util.HashMap;
import java.util.Map;

/** Create a HashMap object called people that will store String keys and Integer
 values: And use for each loop to iterate the value from Map.*/
public class Pgrm9HashMap {
    public static void main(String[] args) {
        Pgrm9HashMap obj = new Pgrm9HashMap();
        obj.addElement();

    }
    Map<String,Integer> map = new HashMap<>();
    public void addElement(){
        map.put("Tulip",1);
        map.put("Sunflower",2);
        map.put("Lily",3);
        map.put("Rose",4);
        map.put("Jasmin",5);
        map.put("Orchid",6);

        for (Map.Entry<String,Integer> map:map.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
