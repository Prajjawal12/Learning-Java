package TestPackage;

import AccessModifierCodes.Test;
//class cannot be instantiated here because default access modifier was used
public class DefaultTest {
   public static void main(String[] args) {
    Test t = new Test();
    t.display();
   }
}
