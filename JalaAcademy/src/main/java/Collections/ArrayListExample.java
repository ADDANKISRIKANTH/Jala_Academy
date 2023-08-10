package Collections;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        java.util.ArrayList<String> al = new ArrayList<>();
        // adding
        al.add("Geeks");
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        al.add("five");
        for(String s: al){
            System.out.println("added values: "+s);
        }
        // deleting
        al.remove(1);
        System.out.println("removed: "+al);
        //adding at index
        al.add(2,"hello");
        System.out.println("Added at index: "+al);

        System.out.println("Size of the list: "+al.size());
        // element contains in list
        String s = String.valueOf(al.contains("hello"));
        System.out.println(s);

    }


}
