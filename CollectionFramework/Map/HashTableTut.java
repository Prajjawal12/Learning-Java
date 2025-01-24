package CollectionFramework.Map;

import java.util.Hashtable;

public class HashTableTut {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
//Hashtable is synchronized
//no null key or value allowed
//Legacy Class, Concurrent Hashmap
//slower than Hashmap
//only linked list, No Balanced Tree in case of collisions
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");
        System.out.println(hashtable);
        System.out.println(hashtable.get(2));
        System.out.println(hashtable.contains(3));
        hashtable.remove(1);
        System.out.println(hashtable);
    }
}
