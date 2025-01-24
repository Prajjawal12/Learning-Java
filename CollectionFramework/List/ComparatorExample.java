package CollectionFramework.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
   

    public static void main(String[] args) {
        PersonInfo p1 = new PersonInfo(21, "A");
        PersonInfo p2 = new PersonInfo(35, "B");
        PersonInfo p3 = new PersonInfo(10, "C");
        PersonInfo p4 = new PersonInfo(21, "D");

        List<PersonInfo> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        System.out.println(list);
        // list.sort((a,b) -> {
        //     if((a.getAge() - b.getAge()) > 0) {
        //         return 1;
        //     }else if((a.getAge() - b.getAge() < 0)) {
        //         return -1;
        //     }else {
        //         return o1.getName().compareTo(o2.getName());
        //     }
        // });

        //Java 8 feature
        Comparator<PersonInfo> comparator = Comparator.comparing(PersonInfo::getAge).reversed().thenComparing(PersonInfo::getName);
        list.sort(comparator);

        for(PersonInfo x : list) {
            System.out.println(x.getName() + " " + x.getAge());
        }



    }

}
