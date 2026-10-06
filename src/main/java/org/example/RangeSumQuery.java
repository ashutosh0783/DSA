package org.example;

public class RangeSumQuery {
    public static void main(String[] args) {

        int[][] queries = new int[][] {
                {0, 2},
                {1, 3},
                {2, 4}
        };

        int[] arr = {10,4,-9,3,7,-3,5,14};
       // rangeSumValues(arr, queries);
        RangeSumQuery rangeSumQuery = new RangeSumQuery();
            rangeSumQuery.rangeSumQuerypract(arr, queries);



    }
    //Bruteforce approach non optimize
    private static void rangeSumValues(int[] arr, int[][] queries){
       for(int i = 0; i < queries.length; i++){
           int L = queries[i][0];
           int R =  queries[i][1];
           int sum = 0;
           for( int j = L; j <=R; j++){
                sum += arr[j];
           }
           System.out.printf("sum from %d to %d is :%d%n", L, R, sum);
       }

    }

    //Optimized Approach
    //create prefix sum array
    private static void rangeSumQuery(int[] arr, int[][] queries){
        int[] prefixSums = new int[arr.length];
        for(int i = 1; i < arr.length; i++){
            prefixSums[0] = arr[0];
            prefixSums[i] = arr[i] + arr[i-1];
        }



    }
    public void rangeSumQuerypract(int[] arr , int[][] query){

        int n = query.length;
        for( int i = 0; i < n; i++ ){
            int L = query[i][0];
            int R = query[i][1];
            int sum = 0;
            for(int j = L; j<=R; j++){
                sum += arr[j];

            }
            System.out.print(sum + " ");
        }
    }

}
