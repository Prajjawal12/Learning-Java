package Exception_Handling;
//Put the parent claass "Exception" at the end because if not then it will catch all the exceptions.

public class MultipleCatch {
    class Student {
        private int age;
        private String name;
    }
    public static int divide(int a,int b) {
        try {
            Student s = null;
            s.age = 10;
            s.name = "Example";
            return a/b;
            //below is error because in multi catch in a single cath block both exceptions should be disjoint, ArithmeticException extends Runtime exception hence below is an error
        }catch(ArithmeticException | RuntimeException e) {
            System.out.println(e);
            return -1;
        }catch(NullPointerException e) {
            System.out.println(e);
            return -1;
        }catch(RuntimeException e){
            System.out.println(e);
            return -1;

        }
        catch(Exception e) {
            System.out.println(e);
            return -1;
        }
    }
    public static void main(String[] args) {
         int[] numerators = {100,200,300,400};
         int[] denominators = {10,20,0,40};

         for(int i=0; i<numerators.length; i++) {
            int ans = divide(numerators[i], denominators[i]);
            System.out.println(ans);
         }
         System.out.println("Out of program!");
    }
}
