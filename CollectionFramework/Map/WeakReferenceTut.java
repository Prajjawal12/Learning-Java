package CollectionFramework.Map;

import java.lang.ref.WeakReference;

public class WeakReferenceTut {
    public static void main(String[] args) {
        //Weak References need to be made null for JVM to perform Garbage Collection on them

        WeakReference<Person> weak = new WeakReference<Person>(new Person("Atul", 1));
        System.out.println(weak.get());
        System.gc();
        try {
            Thread.sleep(10000);
        }catch(Exception ignore) {

        }
        System.out.println(weak.get());
    }
}
