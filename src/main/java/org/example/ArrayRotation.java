package org.example;

/**
 * Rotates an array to the right by k positions using the "3-reversal" trick.
 * <p>
 * Approach:
 * 1. Reverse the entire array.
 * 2. Reverse the first k elements.
 * 3. Reverse the remaining (n - k) elements.
 * This produces the same result as moving the last k elements to the front,
 * e.g. for {1,2,3,4,5,6,7,8,9} with an effective k=4 -> {6,7,8,9,1,2,3,4,5}.
 * <p>
 * k is normalized with k = k % arr.length so that a k larger than (or equal
 * to) the array length still works correctly, e.g. rotating a length-9 array
 * by k=13 behaves the same as rotating it by 13 % 9 = 4. When k is already
 * smaller than arr.length, this normalization is a no-op.
 * When k is 0 (or normalizes to 0), the first reverseArray(arr, 0, k-1) call
 * gets startIndex=0 > endIndex=-1, so its while loop never runs and the array
 * is left unrotated - which matches the intent described in the inline comment
 * below (k == 0 means "no rotation").
 * <p>
 * Time Complexity: O(n) - each element is touched a constant number of times across the three reversals
 * Space Complexity: O(1) - rotation is done in-place using only a temp variable
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Optimized Approach
        //rotate an above array k times
        //k%arr.length = k Iterations (normalizes k so it's always < arr.length)
        //now rotate the array K times // output -> 912345678 ->891234567 ->789123456 ->678912345
        //when k is zero then output will be original array so similiary if mod is zero then also o/p is same array without rotation
        int k = 4;
        k = k % arr.length;
        reverseArray(arr, 0, arr.length - 1);///reverse complete array
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);

        for (int a : arr) {
            System.out.print(a + " ");
        }

        rotateArrayPractice(arr,arr.length,k);
    }

    // Time Complexity: O(n) - loop runs ~n/2 times for a segment of length n
    // Space Complexity: O(1) - only a temp variable is used for swapping
    public static void reverseArray(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    public static void rotateArrayPractice(int[] arr, int n, int k) {
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;


        }
        System.out.println("");
        System.out.println("========================");
        for (int a : arr) {

            System.out.print(a + " ");

        }
        System.out.println("");
        System.out.println("========================");
    }
}
