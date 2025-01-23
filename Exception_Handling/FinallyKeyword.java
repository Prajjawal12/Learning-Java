package Exception_Handling;

public class FinallyKeyword {
    //If we want to ensure that some code runs regardless of what happens in try catch block,in that scenario we use finally along with try catch block
    //The code in the finally block runs regardless of whether we have caught an exception or not
    public static void main(String[] args) {
        int[] arr = new int[5];

        try{
            System.out.println(arr[1]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("You are trying to access an element out of bounds of the array.");
        }finally {
            System.out.println("The try-catch block is finished");
        }
    }
}
