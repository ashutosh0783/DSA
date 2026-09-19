package org.example;

// Time Complexity: O(n * k) - rotateByOne does O(n) work and is called k times
// Space Complexity: O(1) - rotation is done in-place using only a temp variable
public class UnoptimizedArrayRotationApproach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Unoptimized Approach
        //rotate an above array k times
        //shift the whole array right by one place, repeat that k times
        //output -> 912345678 ->891234567 ->789123456 ->678912345
        int k = 4;
        for (int i = 0; i < k; i++) {
            rotateByOne(arr);
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    // Time Complexity: O(n) - shifts every element right by one position
    // Space Complexity: O(1) - only a temp variable is used to hold the wrapped element
    public static void rotateByOne(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
}
