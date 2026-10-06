package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 2, 45, 33, 4, 7, 8);
        int largest = 0;
        int secondLargest = 0;
        for (Integer i : list) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i < largest && i > secondLargest) {
                secondLargest = i;
            }
        }
        System.out.println("largest = " + largest + " second largest = " + secondLargest);


    }
}
