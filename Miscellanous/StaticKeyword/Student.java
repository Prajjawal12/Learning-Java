package Miscellanous.StaticKeyword;
public class Student {
   public static int count = 0;
    public static int checkFee;
    public static String schoolName;
    private int id;
    private String name;

   Student() {
    count++;
   }

   static {
    checkFee = 20000;
    schoolName = "Aligarh Muslim University";
   }

   public static void printMessage() {
    System.out.println("This is message printed without instantiating the class!");
   }
    
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
