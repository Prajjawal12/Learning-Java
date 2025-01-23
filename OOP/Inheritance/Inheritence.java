package OOP.Inheritance;

//Inheritence is also a core pillar of OOP, through inheritence a child/sub class can inherit from a parent/superclass
//this promotes code re usabilitiy
//Java supports following types of Inheritence
/*
 * 1.)Single Inheritence
 * 2.)Multilevel Inheritence
 * 3.)Hierarchical Inheritence
 * 4.)Multiple Inheritence(can only be achieved through interfaces)
 */
//Java does not support multiple inheritence with class to avoid the "diamond problem"
public class Inheritence {
    
    static class Animal {
        void eat() {
            System.out.println("The animal eats.");
        }
    }
// 1.)Single Inheritance
// In this type of inheritance, one child class inherits from one parent class.
static class Dog extends Animal {
    void bark() {
        System.out.println("The Dog Woofs!");
    }
}
//2.)Multi level Inheritance
//In this type of inheritance, there are multiple levels above the sub class of parent class that it could be inheriting the properties and behaviours from
static class Mammal extends Animal{
    void walk() {
        System.out.println("The mammal walks on land!");
    }
}

 static class Human extends Mammal {
    void think() {
        System.out.println("The human thinks!");
    }
}

//3.)Hierarchical Inheritance
//In this type of inheritance, multiple classes at same hierarchy inherit from same parent class.
static class Cat extends Animal {
    void meow() {
        System.out.println("The Cat meows!!");
    }
}

static class Horse extends Animal {
    void neigh() {
        System.out.println("The horse neighs!!");
    }
}

//4.)Multiple Inheritence(Can only be achieved through using interfaces)
//We use interfaces,because if a method with same name is implemented in different classes then it would
//become ambiguos to inherit from which class, hence by using an interface we implement the method
// in the class which implements the interface

interface Swimmer {
    void swim();
}

interface Runner {
    void run();
}

interface Cyclist {
    void cycle();
}

public static class Athlete implements Swimmer,Cyclist,Runner {

    @Override
    public void run() {
       System.out.println("Athlete Runs!");
    }

    @Override
    public void cycle() {
       System.out.println("Athlete Cycles!");
    }

    @Override
    public void swim() {
       System.out.println("Athlete swims");
    }
    
}
public static void main(String[] args) {
    //Single Inheritance
    Dog dog = new Dog();
    dog.eat();
    dog.bark();
    //Multilevel Inheritance
    Human human = new Human();
    human.eat();
    human.walk();
    human.think();

    // Hierarchical Inheritance
    Cat cat = new Cat();
    cat.eat();
    cat.meow();

    Horse horse = new Horse();
    horse.eat();
    horse.neigh();


    //Multiple Inheritance
    Athlete athlete = new Athlete();
    athlete.cycle();
    athlete.run();
    athlete.swim();
}
}
 