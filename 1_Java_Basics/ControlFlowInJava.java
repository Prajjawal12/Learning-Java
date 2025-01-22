import java.util.Scanner;

public class ControlFlowInJava {
    //Control flow refers to the order in which a program executes
    /*
     * Types of Control Flow Statements
     * Conditional Statements like if-else,switch
     * Looping Statements like for,while,do-while
     * Jump Statements like break,continue,return
     */
   public static String printName(String myName) {
        return "My name is " + myName;
    }
    public static void main(String[] args ) {
        
        //conditional statements
        // These are used to execute a block of code based on 
        //if-else statements
        Scanner sc = new Scanner(System.in);

        //Whether a number if positive, negative or zero
      //  int a = sc.nextInt();
        int a = 5;
        if(a > 0) System.out.println("a is positive!");
        else if(a < 0) System.out.println("a is negative!");
        else System.out.println("a is zero!");

        //ternary operator

       String ans =  (a%2 == 0) ? "a is even!" : "a is odd!";
       System.out.println(ans);

       //switch statement
       switch(a%2) {
        case 1:
        System.out.println("a is odd!");
        break;
        case 0:
        System.out.println("a is even");
        break;
        default:
        System.out.println("Default Case!");
       }

       /* Looping Statements */
        // a.)For loop
        for(int i=0; i<10; i++) {
            System.out.print(i+5 + "|");

        }

         // b.) while loop
         System.out.println("\n");
         int i = 0;
         while(i!=3){
            System.out.print(i+"|");
            i++;
         }   

         // c.)do while loop
         System.out.println("\n");
         i=0;
         do {
            System.out.print(i + "|");
            i++;
         }while(i!=4);

         /* Jump statements in Java */

         //break statement
         //used to exit from loops prematurely and trasnfers control to next statement in the code
         System.out.println("\n");
         i = 0;
         int[] arr = new int[5];
         for(i=0; i<5; i++) {
            arr[i] = i+1;
         }

         for(i=0; i<5;i++) {
            if(i==3) break;
            System.out.print(arr[i] + "|");
         }


         //continue statement
         // it skips the current iteration and jumps to the next one

         System.out.println("\n");
         i = 0;
         for(i=0; i<5; i++) {
            arr[i] = i+1;
         }

         for(i=0; i<5;i++) {
            if(i==3) continue;
            System.out.print(arr[i] + "|");
         }

         //return statement 
         // this is used within a function to return the result of computations from the function back to the caller of the function
         System.out.println("\n");
         String res = printName("Prajjawal");
         System.out.println(res);

    }
}

