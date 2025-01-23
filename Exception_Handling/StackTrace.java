package Exception_Handling;

public class StackTrace {
 public static  void level3() {
        int[] a = new int[5];
        a[5] = 10;
    }
   public static  void level2() {
        level3();
     }

     public static void level1() {
        level2();
     }
    public static void main(String[] args) {
        try{
            level1();
        }catch(ArrayIndexOutOfBoundsException e) {
           // System.out.println("Array is out of bounds!");
           //below piece of code does the same as printing the stack trace
        //    StackTraceElement[] st = e.getStackTrace();
        //    for(int i=0; i<st.length; i++) {
        //       System.out.println(st[i]);
        //    }
            //below line does the same thing as well
        e.printStackTrace();
        }
    }
}
