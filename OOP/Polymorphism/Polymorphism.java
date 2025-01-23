package OOP.Polymorphism;

//Polymorphism is one of the core pillars of OOP in Java, through polymorphism,an object behaves as an instance of the Parent class rather than the actual class
//This allows flexibility as the method to run is determined on runtime

//Polymorphism are of two types:- 
//1.) Compile Time Polymorphism (Method Overloading)
//2.)Runtime Polymorphism (Method Overriding)
public class Polymorphism {
//METHOD OVERLOADING
/*
 * Overloaded method must change the argument lists
 * Overloaded method can change the return type
 * Overloaded method can change the access modifier
 * Overloaded method can be in the same class or a subclass
 */
    static class Calculator {
        int add(int a,int b) {
            return a+b;
        }

        int add(int a,int b,int c) {
            return a+b+c;
        }

        double add(double a,double b) {
            return a+b;
        }
    }


    //Runtime Polymorphism
    //Method Overriding
   static class Vehicle {
        void run() {
            System.out.println("Vehicle is running!");
        }
    }
    static class Aeroplane extends Vehicle {
        @Override
        void run(){
            System.out.println("Plane is flying");
        }
    }

    public static void main(String[] args) {

        //Method Overloading
        Calculator c = new Calculator();
        System.out.println(c.add(12, 23));
        System.out.println(c.add(1, 2, 3));
        System.out.println(c.add(12.2, 13.42));


        //Method Overriding
        Vehicle v = new Aeroplane();
        v.run();
    }

}
 