package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxSum {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 3, 4, 1))));
    }

    public static int solve(ArrayList<Integer> A) {
        int min = A.get(0), max = A.get(0);
        for (int x : A) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return min + max;
    }
}
