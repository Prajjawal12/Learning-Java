package Java_Basics;

import java.io.*;

public class OperatorsInJava {
    //Operators are special symbols which are used to perform operations on variables or values
    //Types of operators in Java
  public static void main(String[] args) {
      //1.)Arithmetic Operators
    //Can be performed on both primitive and non primitive data types
    // * , / , + , - , %
    System.out.println("Arithmetic Operators:");
    int a = 10;
    int b = 20;
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);

    //2.)Unary Operators
    // - (negates a value) 
    // + (indicates a positive value)  ----> converts byte,short,char to int automatically
    // ++ (increment {can be pre/post})
    // -- (decrement {can be pre/post})
    //! (inverts a boolean value)
    System.out.println("Unary Operators");
    a = 10;
    b = -a;
    System.out.println(b); // negation 

    boolean flag1 = true;
   boolean flag2 = !flag1;
   System.out.println(flag2); //inversion of boolean value in flag1

   //pre and post increment/decrement

   a = 25;
   System.out.println(a++); // prints 25 but updates value of a to 26
   System.out.println(++a); // value of becomes 27 and then gets printed
   System.out.println(a--); //print 27 and then updates value of a to 26
   System.out.println(--a); // updates a to 25 and then prints it

   //3.)Assignment Operator
   //Used to assign a value on right to a variable on left
   //used to create compound operators
   // += : Add and assign
   // -= : Subtract and assign
   // *= : Multiply and assign
   // /= : Divide and assign
   // %= : Module and assign


   //4.)Relational Operator
   //These operators are used for comparing values,they return result as boolean values
   // == : Equal To
   // != : Not Equal To
   // < : Less Than
   // <= : Less than or equal to
   // > : Greater than
   // >= : Greater than or equal to
    System.out.println("Relational Operator\n");
   a = 10;
   b = 5;
 int  c = 3;
   System.out.println(a>b);
   System.out.println(a<b);
   System.out.println(a == b);
   System.out.println( a != b);
   System.out.println(a <= b);
   System.out.println(a >= b);

   //5.)Logical Operators
   // These operatos are used to perform logical operations like AND, OR and NOT.
   // && : Logical AND
   // || : Logical OR
   // ! : Logical NOT
    System.out.println("Logical Operator");
   boolean x = true;
   boolean y = false;

   System.out.println(x && y);
   System.out.println(x || y);
   System.out.println(!x);
   System.out.println(!y);

// 6.) Ternary Operator
//It is a short hand representation of if-else statment
// syntax : (condition) ? execute if true : execute if false
//it has three operands that is why it is called ternary operator
System.out.println("Ternary Operator");
 String ans =   (x != y) ? "Value of x is not equal to y" : " Value of x is equal to y" ;
 System.out.println(ans);


//7.) Bitwise Operators
//These are used to manipulate individual bits of a number
// & : Bitwise AND
// | : Bitwise OR
// ^ : Bitwise XOR 
// ~ : Bitwise Complement(1's complement)
System.out.println("Bitwise Operators");
int d = 0b101;
int e = 0b111;

System.out.println(d & e);
System.out.println(d | e);
System.out.println(d ^ e);
System.out.println(~d);
System.out.println(~e);

//8.)Shift Operators
//This operator is used to shift bits left or right
// << : Left Shift Operator
// >> : Right Shift Operator
System.out.println("Shift Operators");
System.out.println(2 << 1);
System.out.println(2 >> 1);

//9.)instanceof Operator
//It can be used to check if an object is an instance of class, subclass or interface

class Person {}
interface MyInterface{}
class Boy extends Person implements MyInterface {}

Person p = new Person();
Boy b1 = new Boy();

System.out.println(b1 instanceof Boy);
System.out.println(p instanceof Person);
System.out.println(b1 instanceof Person);






    
  }
       
}
