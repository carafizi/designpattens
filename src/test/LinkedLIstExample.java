package test;

import java.util.LinkedList;
import java.util.List;

public class LinkedLIstExample {

    static String listToString(List<String> list){
        StringBuilder builder = new StringBuilder();
        for (String el : list){
             builder.append(el + " ");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        System.out.println(listToString(linkedList));
        
        linkedList.addFirst("z");

        System.out.println(listToString(linkedList));

        String positin = linkedList.pop();

        System.out.println(listToString(linkedList));

        linkedList.add(2, "x");

        System.out.println(listToString(linkedList));

        linkedList.remove("x");

        System.out.println(listToString(linkedList));
    }
}
