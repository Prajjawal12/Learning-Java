package CollectionFramework.List;
//Stack follows the LIFO principle and extends vector,thereby making it thread safe but with LIFO properties

import java.util.Stack;

public class StackTut {
public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println(st);
    st.pop();
    System.out.println(st);
    System.out.println(st.peek());
    System.out.println(st.isEmpty());
    System.out.println(st.size());
     
    //1 based indexing from top
    int searchIt = st.search(1);
    System.out.println(searchIt);
}    
}
