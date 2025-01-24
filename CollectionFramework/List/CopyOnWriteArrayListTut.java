package CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTut {

    public static void main(String[] args) {
        // "Copy on Write" means that for write operations we craete a copy of the list
        //All write are performed on that copy,laeving original list for efficient reading
        //This ensures efficient reading of thread is unaffected 
       //This is more suitable when we require intensive read operations because it is memory intensive for write operations
       //After modification,the reference to the list is updated,so subsquent readers see the new list

       //Demo
       List<String> shoppingList = new CopyOnWriteArrayList<>(); // using arraylist causes ConcurrentModificationException
       shoppingList.add("Bread");
       shoppingList.add("Butter");
       shoppingList.add("Milk");

       for(String x : shoppingList) {
        if(x.equals("Milk")) {
               shoppingList.add("Eggs");
               System.out.println("Added Eggs in the list");
        }
       }
        
       System.out.println(shoppingList);

    }
}
