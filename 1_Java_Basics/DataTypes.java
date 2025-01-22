public class DataTypes {
    public static void main(String[] args) {
        //Data Types in java are classfied in two categories namely
        //1.)Primitive Data Types :- int,char,short,byte etc.
        //boolean data type 
        //default value if false
        boolean b; 
        b = true;

        //byte data type
        //default value is 0
        byte byteVar;
        byteVar = 10;

        //short data type
        //default value is 0
        short shortVar;
        shortVar = 10;

        //int data type
        //default value is 0
        int intVar;
        intVar = 25;

        //long data type
        //default value is 0
        long longVar;
        longVar = 25;

        //float data type
        //default value is 0.0
        float floatVar;
        floatVar = 10.03f;

        //double data type
        //default values is 0.0
        double doubleVar;
        doubleVar = 12.09;

        //char data type
        //default value is \u0000
        char charVar;
        charVar = 'v';
        

        //2.)Non Primitive or Object Data Type :- Strings,Array etc.
        //These are also called reference types because they contain memory address of variable values
        //They don't directly store the values directly in memory but instead point to them
        
        //Strings
        //difference in String and a char array is that in String a variable holds the complete sequence of characters
        //but a char array is a collection of seperate char type entities
        String s = "Prajjawal";

        String s1 = new String("Example");

        //Class
        //Class is like a blueprint,it holds methods and properties which are common to objects created from it
        //Class's access is determined by access modifiers it has
        //A class can only have one parent class i.e we can only extend one class 
        //A class can implement several interfaces seperated by commas

        class Example {
            private int id;
            private String desc;
        }

        //Object
        //Object is created when we instantiate a class,an object represents a real world entity
        //Attributes of object represent it's state while methods of object represent it's behaviour

        Example e = new Example();
        e.id = 1;
        e.desc = "Some description";

        //Interface
        //Interface acts like a blueprint to a class, it contains the methods that a class has to implement

        //Array
        //Homogenous contigous collection of elements
        //all arrays are objects in java and it's length can be found using member length
        int[] arr = new int[1000];
                
    }
}
