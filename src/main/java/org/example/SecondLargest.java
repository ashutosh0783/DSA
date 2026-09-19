package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 2, 45, 33, 4, 7, 8);
        List<Integer> sorted = list.stream().distinct().sorted().toList();
        System.out.println(sorted.get(sorted.size()-2));
        List<Integer> sortedList = list.stream().distinct().sorted().toList();
        HashSet<Integer> integers = new HashSet<>(sortedList);


    }
}
