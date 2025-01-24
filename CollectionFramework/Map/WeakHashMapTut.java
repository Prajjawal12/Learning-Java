package CollectionFramework.Map;

import java.util.WeakHashMap;

public class WeakHashMapTut {

    private static void simulateRun() {
     try {
        System.out.println("Application is running....");
        Thread.sleep(10000);
     }catch(InterruptedException e) {
        e.printStackTrace();
     }
    }
    public static void main(String[] args) {
        WeakHashMap<String,Image> wmap = new WeakHashMap<>();
//Entity in weak hash map are removed when it's key is no longer under ordinary use
//Below keys are strong referenced because they are stored in string pool as string literals are strong referenced throughout the java program
        wmap.put("img1", new Image("Image 1"));
        wmap.put("img2", new Image("Image 2"));
        //below have weak reference for keys
        wmap.put(new String("img3"), new Image("Image 3"));
        wmap.put(new String("img4"), new Image("Image 4"));
        System.out.println(wmap);
        System.gc(); //only a suggesion
        simulateRun();
        
        System.out.println("After running: " + wmap);



    }
}

class Image {
    private String name;

    
    Image(String name) {
        this.name = name;
    }
   
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

}