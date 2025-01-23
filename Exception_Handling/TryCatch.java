package Exception_Handling;
//Using Try Catch block,we can catch the exception object in the catch block and return a customized message to continue the flow of the program
public class TryCatch {
    public static int divide(int a,int b) {
        try{
            return (a/b);
        }catch(ArithmeticException e) {
            //Throwing an error also stops the normal flow and terminates the program,to continue normal flow make sure to catch the error
            //Unhandles exceptions will always terminate thr program
            //throw new ArithmeticException("Division by zero is an invalid operation");
            //reference :- https://stackoverflow.com/questions/4493832/does-throwing-an-exception-have-to-cause-the-program-to-terminate
            System.out.println("Division by zero is an invalid operation\n");
            return -1;
           
        }
    }
    //building up from previous example
    public static void main(String[] args) {
        int[] numerators = {100,20,40,125};
        int[] denominators = {10,2,0,25};

        for(int i=0; i<numerators.length; i++) {
            int ans = divide(numerators[i], denominators[i]);

            System.out.println(ans);
        }
        }


}
