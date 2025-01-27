package Miscellanous.ThisAndSuperKeyword;

// `this` and `super` are two important keywords in Java used for different purposes:
// 1. `this`: Refers to the current instance of the class.
// 2. `super`: Refers to the immediate parent class of the current object.

public class Main {

  public static void main(String[] args) {

    Dog dog = new Dog("Buddy", "Golden Retriever");

    dog.describe();
  }
}

class Animal {
  String name;

  public Animal(String name) {
    // Using `this` to refer to the current object's field
    this.name = name;
  }

  // Method to describe the animal
  public void describe() {
    System.out.println("I am an animal. My name is " + name + ".");
  }
}

class Dog extends Animal {
  String breed;

  public Dog(String name, String breed) {
    // Using `super` to call the parent class constructor
    super(name);

    // Using `this` to differentiate the local variable from the field
    this.breed = breed;
  }

  @Override
  public void describe() {
    // Using `super` to call the parent class method
    super.describe();

    // Using `this` to access the current class's fields
    System.out.println("I am also a dog of breed: " + this.breed + ".");
  }
}
