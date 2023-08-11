package Collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Srikanth");
        hashMap.put(2,"Amit");
        hashMap.put(3,"Abdul");
        hashMap.put(4,"Rohit");
        hashMap.put(5,"Vishal");
        hashMap.put(6,"Malli");
        System.out.println("Output: "+hashMap);
        System.out.println("Name of the student with id no 6:");
        System.out.println(hashMap.get(6));
        System.out.println("Id no 3 is in the map");
        System.out.println(hashMap.containsKey(3));
        System.out.println("Student name Amit is in the map: ");
        System.out.println(hashMap.containsValue("Amit"));
        System.out.println("Checking if the map is empty: ");
        System.out.println(hashMap.isEmpty());
        System.out.println("The size of the map is: ");
        System.out.println(hashMap.size());
        System.out.println("All id's of the keySet: ");
        System.out.println(hashMap.keySet());
        System.out.println("All the values of the map: ");
        System.out.println(hashMap.values());
        System.out.println("Remove one value: ");
        hashMap.remove(4,"Rohit");
        System.out.println(hashMap);
        System.out.println("Put all values in separate: ");
        HashMap<Integer, String> ss = new HashMap<>(hashMap);
        System.out.println(ss);
    }
}
