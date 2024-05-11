package _03_04.end;

import java.util.LinkedHashMap;

public class LinkedHashmapExample {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> basket1 = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> basket2 = new LinkedHashMap<>(10,0.75f, true);

        System.out.println("First basket (normal LinkedHashMap):");
        basket1.put("apple", 2);
        basket1.put("orange", 1);
        basket1.put("banana", 3);
        basket1.forEach((key, value) -> System.out.println(key + ": " + value)); // shows all items in the order that they were INSERTED in

        System.out.println("\nSecond basket (with arguments in the constructor):");
        basket2.put("apple", 2);
        basket2.put("orange", 1);
        basket2.put("banana", 3);
        basket2.get("apple");
        basket2.forEach((key, value) -> System.out.println(key + ": " + value)); // shows all items in the order that they were last ACCESSED in
        
    }
}
