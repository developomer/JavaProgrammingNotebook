package day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;


public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array Based Class ===> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);

        arrayList.remove(0);

        arrayList.get(0);


        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class (Doubly linked List) ===> add(), addAll(), remove(), removeAll(), removeIf(), retainAll() are faster.
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300); 
        linkedList.add(400);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("---------------------------------------------------------");

        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);

        System.out.println("------------------------------------------------------------");

        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);

        int lasElement = stack.pop();

        System.out.println(stack);

        int secondLasElement = stack.pop();

        System.out.println(stack);


    }

}
