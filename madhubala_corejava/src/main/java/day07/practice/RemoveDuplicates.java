package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

    public void removeDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
    }

    public static void main(String[] args) {
        ArrayList<Integer> listofint = new ArrayList<Integer>();
        listofint.add(2);
        listofint.add(2);
        listofint.add(4);
        listofint.add(4);
        listofint.add(5);
        listofint.add(6);
        listofint.add(4);

        System.out.println("Original List: " + listofint);
        RemoveDuplicates remover = new RemoveDuplicates();
        remover.removeDuplicates(listofint);
        System.out.println("List after removing duplicates: " + listofint);
    }
}
