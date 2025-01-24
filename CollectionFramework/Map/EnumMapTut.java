package CollectionFramework.Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapTut {
    public static void main(String[] args) {
        //If all the keys in the map are from a single enum,then it is a good practice to use an EnumMap as the specific implementation
        //EnumMap has the advantage of knowing keys in advance

        //Internally used an array
        //ordinal/index is used i.e order is according to keys placed in enum
        //Faster than HashMap
        //Memory Efficient

        Map<Days,String> days = new EnumMap<>(Days.class);
        days.put(Days.FRIDAY,  "Pray");
        days.put(Days.MONDAY, "Shopping");
        System.out.println(days);
        
    }

    enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}
