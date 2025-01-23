package AccessModifierCodes;
class AccessModifiers {
    //Access Modifiers in Java
    //We specify the scope of class,constructor,method,variable,data member in java using Access Modifiers

    /*
     * Types of access modifiers
     * 1.)Default
     * 2.)Private
     * 3.)Protected
     * 4.)Public :- Members,Methods or Constructors with this access specifier are accesible across packages and have the widest scope among the other access modifiers
     */
    public static void main(String[] args) {
        //a.)Default Access Modifier
        // This access specifier is default in java, methods,members or constructors having this access specifer are accessible across the same package
       Test t = new Test();

       t.display();
    }
}
