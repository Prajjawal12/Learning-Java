package CollectionFramework.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTut {
  static  class StringLengthComparator implements Comparator<String> {
       
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length(); // ascending order in terms of length
        }
    }

static class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      //  return o1-o2; // ascending
     // return o2-o1; //descending
     return 0; // no change
    }
    
}
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

  //list.sort(new IntegerComparator());
  //we can also use lambda expressions
  list.sort((a,b) -> a-b);
  System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
       // words.sort(new StringLengthComparator());
       words.sort((s1,s2) -> s1.length() - s2.length());
        System.out.println(words);


    }
}
