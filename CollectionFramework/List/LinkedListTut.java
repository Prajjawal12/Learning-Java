package CollectionFramework.List;
import java.util.Arrays;
//Linked List is a part of collections framework which implements the list interface.This stores the elements in nodes of a doubly linked list
//Compared to Array List
//Linked list is better for insertion and deletion in the middle of list as we do not have to shift elements but just adjust the pointers
//Unlike ArrayList we do not have random access in LinkedList
//To store an element,we use more space in LinkedList than in an ArrayList as we are also storing a pointer along with data
import java.util.LinkedList;
import java.util.List;

public class LinkedListTut {
   public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(12);
    list.add(5);
    list.add(3);
    list.add(2);
    list.get(3); // O(n)
    list.addLast(4); // O(1)
    list.addFirst(0); // O(1)
    list.getFirst();
    list.getLast();
    System.out.println(list);
    list.removeIf((a)-> a == 3);
    System.out.println(list);

    //Creating a Linked List on the fly
    LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog", "Elephant"));
    LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat","Lion"));

    animals.removeAll(animalsToRemove);

    System.out.println(animals);
    //We can also give parent reference
    List<Integer> list1 = new LinkedList<>();
   }


}
