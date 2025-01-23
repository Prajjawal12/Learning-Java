//Arraylist is an implementation of the List interface.Unlike arrays in Java,which have fixed size, an Arraylist can change it's size dynamically
//as elements are added and removed, it is preffered when number of elements are not known in advance.
package CollectionFramework.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ArrayListTut {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        // System.out.println(list.size());
        // System.out.println(list.get(0));



        list.add(1);
        list.add(2);
        list.add(3);
        // list.remove(Integer.valueOf(1));
        // list.remove(1);
        System.out.println(list.get(2));

        for(int x:list) {
            System.out.print(x + "|");
        }
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.contains(1));
        // list.remove(1); 
        for(int x:list) {
            System.out.print(x + "|");
        }  
        System.out.println();

//add shifts the current index element to right and places the new one
        list.add(0,100);
        System.out.println(list);
// set replaces the element at the specified index
       list.set(0, 98);
       System.out.println(list);

 //Internal Working
 // Internally, the Arraylist is implemented as an array of Object references.When we add elements to an ArrayList we are indirectly 
 //storing elements to the internal array,when the array gets full its content are copied to another array of 1.5 times size
 //Capacity is initially 10,but size is 0.

 // intial capacity -----> check if full ---> resize ---> add element

 //copying the elements from old to new array is of time complexity O(n).



 //----> Removing Element Steps
 //Check Bounds:- Whether the index is within range
 //Remove Element:- remove the element and shift the objects to the left
 //Reduce size by 1


 List<String> list1 = new ArrayList<>();
 System.out.println(list.getClass().getName());

//using asList method we can create a fixed size array
 List<String> list2 = Arrays.asList("Monday" , "Tuesday");
System.out.println(list2.getClass().getName());
//in fixed size lists we cannot add elements,but we can modify existing elements
list2.set(0, "Wednesday");

String[] arr = {"Apple" , "Banana", "Oranges"};
List<String> list3 = Arrays.asList(arr);
System.out.println(list3.getClass().getName());

//creating unmodifiable list i.e no addition and no modification is allowed
List<String> list4 = List.of("One", "Two", "Three", "Four");
// list4.set(0, "Five");
//In our Arraylist constructor, instead of size we can also give another collection
List<String> list5 = new ArrayList<>(list4);
list5.add("Five"); // these strings are added from the end

//using addAll method we can add a list to another list which is allowed to be modifiable
list5.addAll(list4);
System.out.println(list5);

//List to array
Object[] array = list5.toArray();
String[] array1 = list5.toArray(new String[0]);

//Sorting an Array
System.out.println(list5);
//Collections.sort(list5);
list5.sort(null);
System.out.println(list5);

// Acces by index is O(1)
//Adding an element is O(n)
//Removing an element is also O(n)
//Iteration is also O(n)









    }
}
