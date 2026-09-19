package org.example;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};
        int n = arr2.length;
        int i=0,j=n-1;
        reverseArray(i, j, arr1, n);
        System.out.println("===========");
        //to reverse the array within sume specific index(sub array)
        // just change the I and J for that index
        i = 3;
        j = 8;
        reverseArray(i, j, arr2, n);
    }

    private static void reverseArray(int i, int j, int[] arr, int n) {
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k = 0; k< n; k++){
            System.out.print(arr[k]+" ");
        }
    }


}
