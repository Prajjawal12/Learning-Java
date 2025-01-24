package CollectionFramework.Map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListTut {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer,String> csmap = new ConcurrentSkipListMap<>();
        //Skip List is a probabilistic data structure that allows for efficient search, insertion and deletion operations.
        //It is similar to a sorted Linked List but with multiple layers that skip over portions of the list to provide faster access to elements
          //Thread safe Tree Map
        //1,2,3,4,5,6,7,8,9


/*
 *  Level 3:- 1 5 9
 * Level 2: -   1 3 5 7 9
 * Level 1 : -  1 2 3 4 5 6 7 8 9
 */

    }
}
