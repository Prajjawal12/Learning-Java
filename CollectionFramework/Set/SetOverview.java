package CollectionFramework.Set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetOverview {
    public static void main(String[] args) {
        //Set is a collection that cannot have any duplicate values
        //faster operations
        // Map -> HashMap, TreeMap, LinkedHashMap, EnumMap
        //Set -> HashSet, TreeSet, LinkedHashSet, EnumSet
         // Use HashSet if you dont care about ordering
         //Use LinkedHashSet if you want in the order of insertion
         //Use TreeSet if you want in sorted order
         // User EnumSet if working with Enums
        Set<Integer> st = new HashSet<>();

        st.add(1);
        st.add(14);
        
        System.out.println(st);

        //for thread safety

        // Collections.synchronizedSet(st);
        //preferred for multithreaded environment
        Set<Integer> set1 = new ConcurrentSkipListSet<>();

        //unmodifiable
        Set.of(1,2,3,4,5);
     //   Collections.unmodifiableSet(1,2,3,4,5,6);


      //Copy on write Array set
      //Thread Safe
      //Copy on write Mechanism
      //No duplicate Elements
      //Iterators do not reflect modifications,they happen after loop is done iterating
    }
}
