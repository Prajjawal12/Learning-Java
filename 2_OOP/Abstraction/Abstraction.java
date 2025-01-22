//Abstraction allows us to hide complex implementation details and show only essential features to outside world
//Abstraction is a core OOP principle, in java abstraction can be achieved in two ways, through abstract classes or interfaces
public class Abstraction {
//1.)Using abstract classes
        // In an abstract class, if a method is abstract,then all subclasses must implement it as it cannot be inherited
        //Non abstract methods can be inherited as the way they were defined in the parent class itself.
      static abstract class Vehicle {
            abstract void start();

            void stop() {
                System.out.println("The vehicle has stopped!");
            }
        }

       static class Car extends Vehicle {
            @Override
            void start() {
                System.out.println("Car starts through a key!");
            }
        }

       static class Bike extends Vehicle {
            @Override
            void start() {
                System.out.println("Bike starts with a key!");
            }
        }

    //2.)Using Interfaces for abstraction
    // In an interface, methods are abstract by default
        interface Appliance {
            void turnOn();
            void turnOff();
        }

      static  class Fan implements Appliance {
            @Override
          public  void turnOn() {
                System.out.println("Fan is turned ON!");
            }

            @Override
            public void turnOff() {
                System.out.println("Fan is turned OFF!");
            }
        }

      static  class Light implements Appliance {
            @Override
            public void turnOn() {
                System.out.println("Light is turned ON!");
            }

            @Override
            public void turnOff() {
                System.out.println("Light is turned OFF!");
            }
        }



    public static void main(String[] argsv) {
        
       
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        Appliance myFan = new Fan();
        Appliance myLight = new Light();


        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();

        myFan.turnOn();
        myFan.turnOff();

        myLight.turnOn();
        myLight.turnOff();




    }
    
}
  