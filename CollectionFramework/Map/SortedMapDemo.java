package CollectionFramework.Map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

//SortedMap is an interface that extends map and guarentees that keys are sorted based on the keys,either in their 
//natural ordering or through a comparator
public class SortedMapDemo {
    
    public static void main(String[] args) {
        SortedMap<String,Integer> smap = new TreeMap<>((a,b) -> a.length() - b.length());
        smap.put("Bob", 2);
        smap.put("Alice", 1);
       
        smap.put("Charlie", 3);

        System.out.println(smap);
        System.out.println(smap.firstKey());
        System.out.println(smap.lastKey());
        System.out.println(smap.headMap("Bob"));
        System.out.println(smap.tailMap("Bob"));
       // System.out.println(smap.subMap("Alice", "Bob"));
       //Insertion is O(logn)
       //Retrieval is O(log n)
    }
}
