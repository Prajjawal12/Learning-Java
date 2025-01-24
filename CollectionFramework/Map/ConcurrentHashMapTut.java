package CollectionFramework.Map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTut {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> cmap = new ConcurrentHashMap<>();
        // Working of Concurrent Hashmap
        /*
         * Java 7 --> segment based locking --> 16 segments --> smaller hashmap
         * Only the segment being written or read from was locked
         * read:doesnt require locking unless some write operation is happening on the same segment
         * write: lock
         * 
         * This was not scalable
         */


         /*
          * Java 8 ---> no segmentation
          Instead we started using Compare and Swap ---> no locking unless resizing or collision
          x is 42
          I want x to be 50
          If x is still 42,then change it to 50 or else do nothing and retry

          after doing that it keeps doing the same thing again and again, it does not go forever as it stops after some small random time

          in case of hashmap
          we have an index and it keeps checking again whether we have put the right value against it or not

          resizing in concurrent hashmap is incremental and not multiplied like in HashMap
          */



    }
}
