//Encapsulation is one of the fundamental pillars of OOP, it involves bundling of data(state) and methods(behaviors) in a single class.
//It also involves restriction of access to methods and members using access modifiers

public class Encapsulation {
    
    static class Student {
        private int id;
        private String name;

         public Student(int id, String name) {
            this.id = id;
            this.name = name;
         }

         String getName() {
            return name;
         }

         void setName(String name) {
            this.name = name;
         }

         int getId() {
            return id;
         }

         void setId(int id) {
            this.id = id;
         }

         void display() {
            System.out.println("Name is:" + getName() + " and Id is: " + getId());
         }
    }
    public static void main(String[] args) {
        Student s = new Student(1, "Prajjawal");

        s.display();

        s.setId(23);
        s.setName("Atul");

        s.display();
        
    }

}
 