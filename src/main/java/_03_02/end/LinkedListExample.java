package _03_02.end;

import java.util.LinkedList;

// Linked Lists use more memory than Array Lists so be careful how you use them!

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("first item");
        list.add("second item");

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.poll()); // removes AND RETURNS the first item in the list
        System.out.println(list);

        System.out.println(list.pop()); // same as poll() but if list is already empty --> EXCEPTION!
        System.out.println(list);

        System.out.println(list.poll());
        System.out.println(list.pop());
    }

}