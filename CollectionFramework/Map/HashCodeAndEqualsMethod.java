package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person,String> hmap = new HashMap<>();

        Person p1 = new Person("Abhay",1);
        Person p2 = new Person("Birla", 2);
        Person p3 = new Person("Abhay", 1);



       
//3 entries will be in the map because thier hashcode generated will be different because p1 and p2 are at different memoery locations and so their hashcodes are seperate
        hmap.put(p1, "Engineer");
        hmap.put(p2, "Designer");
        hmap.put(p3, "Manager");

        System.out.println(hmap.size());
        System.out.println(hmap.get(p1));
        System.out.println(hmap.get(p3));

        System.out.println(p1);
//In below map,hashcode for key shubham will be same,therefore in next instance the marks will be updated rather than creating a new key value pair
    Map<String,Integer> map = new HashMap<>();
    map.put("Shubham", 90);
    map.put("Neha", 87);
    map.put("Shubham", 99);
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int id;

   Person(String name,int id) {
    this.id = id;
    this.name = name;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj) return true;
       if(obj == null) return false;
       if(getClass() != obj.getClass()) return false;

       Person other = (Person) obj;
       return id == other.getId() && Objects.equals(name, other.getName());
}

@Override
public int hashCode() {
    return Objects.hash(name,id);
}

@Override
public int compareTo(Person o) {
    return Double.compare(o.getId(), this.getId());
}


}
