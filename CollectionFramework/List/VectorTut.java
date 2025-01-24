package CollectionFramework.List;
// Vector in java was introduced in JDK 1.0 even before collection framework,hence it is a legacy class
//Vector is synchronized making it thread safe,however due to synchronization overhead,in single threaded enviroment we use it's alternatives like ArrayList
//But in MultiThreaded Environment Vector is still useful where thread safety is of concern

import java.util.Vector;

public class VectorTut {
    /*
     * Key Features
     * 
     * Dynamic Array :- It grows automatically when more elements are added then it's current capacity
     * Synchronized :-  In vector, all the methods are synchronized that is they are thread safe, which means that multiple threads can work on it without the risk of it corrupting the data
     *                  But this can result in performance overhead in single threaded environment by adding locking and unlocking codes
     * 
     * Legacy Class:- It was released even before Collection Framework hence it is a part of legacy class, it induces performance overhead in single threaded environment
     * Resizing Mechanism :- When current capacity is exceeded, then it doubles the capacity
     * Random Access like arrays and ArrayList
     */

     public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(11,2); // increment means addition not multiplication

System.out.println(vector.capacity());

/*
 * COnstructors in Vector
 * 
 * Vector()  --> vector with initial capacity 10
 * Vector(int initialCapacity) ---> Vector with specified inital capacity
 * Vector(int initialCapacity, int capacityIncrement)
 * Vector(Collection)
 */

 /*
  * Methods
  add(E e)
  add(int index, E element)
  get(int index)
  set(int index, E element)
  remove(Object d)
  size()
  isEmpty()
  contains(Object o)
  clear()
  */
     }
}
