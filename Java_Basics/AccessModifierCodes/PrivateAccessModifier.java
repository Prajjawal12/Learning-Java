package AccessModifierCodes;

public class PrivateAccessModifier {
    private int id;
    private String desc;
}

 class Test {
 public static void main(String[] args) {
    PrivateAccessModifier p = new PrivateAccessModifier();
    //below members are not accesible because they are private in a public class
    
    p.id = 1;
    p.desc = "Example";
 }
}
