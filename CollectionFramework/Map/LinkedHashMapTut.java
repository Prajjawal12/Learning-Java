package CollectionFramework.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTut {
    public static void main(String[] args) {
        //In a LinkedHashMap order is maintained in the way the values are put in it
        LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>(11,0.8f,true); //Implemented using doubly linked list
        //false for insertion order
        // true for access order which means whatever is accessed goes to the end of the map
      
        lmap.put("Atul", 1);
        lmap.put("Bob", 2);
        lmap.put("Charlie", 3);
        lmap.get("Bob");
        lmap.get("Atul");
        
        for(Map.Entry<String,Integer> entry : lmap.entrySet()) {
             System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
}
