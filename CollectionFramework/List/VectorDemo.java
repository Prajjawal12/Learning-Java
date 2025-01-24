package CollectionFramework.List;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
      //  ArrayList<Integer> list = new ArrayList<>(); // THis is not synchronized hence different results are expected on each run
       Vector<Integer> list = new Vector<>();
        Thread t1 = new Thread(() -> {
           for(int i=0; i < 1000; i++) {
            list.add(i);
           }
        });


        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list.size());
    }
}
