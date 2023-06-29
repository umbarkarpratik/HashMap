package DSA.Assignment.HashMapAssign;


import java.util.*;
import java.util.Map;
import java.io.*;
  
public class Hashmapassign2 {
    public static void main(String[] args)
    {
        // HashMap in Java

        HashMap<Integer, String> hashmap = new HashMap<>();
  
        hashmap.put(4, "Anil");
        hashmap.put(2, "Athar");
        hashmap.put(3, "Ajay");
        hashmap.put(1, "Piyush");
        

        System.out.println("Value of HashMap is: "+ hashmap);


        // TreeMap in Java

       

        

        // LinkedHashMap in Java

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
  
        linkedHashMap.put(4, "Anil");
        linkedHashMap.put(2, "Athar");
        linkedHashMap.put(3, "Ajay");
        linkedHashMap.put(1, "Piyush");
        

        System.out.println("Value of LinkedHashMap is: "+ linkedHashMap);
        
        
    }
}
