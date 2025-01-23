package ProtectedAccessModifierCodes;
class Child extends Parent {
     public static void main(String[] args) {
        Child c = new Child();
        //This method in child class is inherited from the parent class,the method has the protected access specifier
        c.display();
     }
}
