package CollectionFramework.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapTut {
    //If we had used Hashmap then the hashcode generated for key1 and key2 would have been same and they would have been stored at same location
    //therefore size of the map would have been 1
    //But in IdentityHashMap instead of class's hashcode,we generate a hashcode for objects,so key1 and key2 below will be treated as seperate objects
    //and they will be stored in different buckets and the size of the map will be 2
    //Hence we can not use equals method in the case of IdentityHashMap which we could do in Hashmao
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        Map<String,Integer> map = new IdentityHashMap<String,Integer>();
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
    }
}
