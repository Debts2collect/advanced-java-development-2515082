package _03_03.end;

import java.util.HashMap;

public class HashmapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> basket = new HashMap<>();
        basket.put("apple", 1);
        System.out.println(basket.get("apple"));

        basket.put("apple", 2);
        System.out.println(basket.get("apple"));

        System.out.println(basket.containsKey("apple"));

        // Add an apple to the basket.
        // If there's already at least one apple inside the basket then increment the amount of apples by 1
        basket.merge("apple", 1, Integer::sum);
        basket.merge("orange", 1, Integer::sum);

        System.out.println(basket.get("apple"));
        System.out.println(basket.get("orange"));
    }

}
