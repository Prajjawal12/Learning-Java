package Exception_Handling;
//Exception Handling is a way of handling runtime errors so that normal flow of the application can be maintained
//An exception is an object which is thrown at runtime,if not handled is halts the execution of the program

public class Example {
   static int divide(int a, int b) {
        return (a/b);
    }
    public static void main(String[] args) {
        int[] numerators = {100,20,23,233};
        int[] denominators = {10,12,0,344};
        for(int i=0; i<4; i++) {
            //On third computation we get an exception for trying to divide by zero
           int ans =  divide(numerators[i],denominators[i]);
           System.out.println("Result of computation: " + ans);

        }
    }
}
