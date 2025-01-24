package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapTut {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<>(12, 0.5f);
        hmap.put(1, "Akshit");
        hmap.put(2, "Bhanu");
        hmap.put(3, "Chirag");

        System.out.println(hmap);
       hmap.putIfAbsent(12, "Daisy");
       hmap.getOrDefault(122, "Not found");
        String student = hmap.get(1);
        System.out.println(student);
        System.out.println(hmap.containsKey(2));
        System.out.println(hmap.containsValue("Chirag"));

        //another way of accessing
        Set<Integer> keys = hmap.keySet();
        
        // for(Integer x: keys) {
        //     System.out.println(hmap.get(x));
        // }

        Set<Map.Entry<Integer,String>> entries = hmap.entrySet();

        for(Map.Entry<Integer,String> entry : entries) {
            System.out.println(entry + "" + entry.getKey() + "" + entry.getValue().toUpperCase());
            // entry.setValue(entry.getValue().toUpperCase())
        }

        hmap.remove(1);
        System.out.println(hmap);
        //Key Characteristics 
        /*
         * Unordered:- Does not maintain order of elements
         * Allows null keys and value:- in hasmap we can have as many null values we want but their can only be one null key to maintain uniqueness of keys
         * Not Synchronized :- Not Thread safe, requires external synchronization
         * Performance:- get and put in O(1) assuming hash function disperses element properly,evens search in hashmap is also O(1)
         */




         /* Internal SStructure of Hashmap */
         //Components of a Hashmap
         //1.)Key :- Identifier used to retireve the value
         //2.)Value:- Data associated with the key
         //3.)Bucket:-PLace where key value pairs are stored
         //4.)Hash Function:- Converts key into index in bucket for storage
         //A hash function is an algorithm that takes an input of any size but returns hash code which is an output of fixed size
         //Deterministic,Fixed Size and Efficient Computation

         /* How Data is stored in the hashmap */

         //Step 1: Hashing the key --> key goes through hash function which return the index of array where the key-value pair will be stored
         //Step 2: Calculating the index ---> The index is calculated through the hascode in following manner
         //int index = hashcode % arraySize , this determines which bucket will hold key value pair
         //Step 3: Storing in bucket, and at one index we can store multiple key-value pair(called collision handling)


         /* How Hashmap retrieves the data */
         //when we use getKey() method following happens
         //1)Create hashcode
         //2,)Use hashfucntion to find index
         //3)search for value on that index

         //What type of data is stored in the array and Why search and not do random access?

         //We search because there can be collisions,for different inputs the hash function can produce the same output
         //Also on each bucket there is a linked list
         //from Java 8 we started using Balanced Trees instead of linked list i.e Red Black Tree(threshold 8)  searching becomes O(logn) from usual O(n)


         /* Hashmap Resizing */
         // Hashmap uses an array internally,when the array becomes o.75 times the usual size i.e 16,it then resizes, 0.75 is the load factor,size becomes double as well

         //During Rehashing,the array size is doubled
         //All existing entries are rehashed and placed into the new array
         
         //Time Complexity
         //put and get and remove --> O(1)[average] , O(log n) [Worst Case]
         //containsKey ---> Average :- O(1), Worst :- O(log n)(When searching through treefied bucket)
         //containsValue :--> Both Average and Worse is O(n) due to linear traversal
         //size ---> O(1) because hashmap internally maintains size as a seperate field

    }
}
