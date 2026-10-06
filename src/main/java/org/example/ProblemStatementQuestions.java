package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProblemStatementQuestions {
    public static void main(String[] args) {

    }
    /*Given an integer array A of size N. You can remove any element from the array in one operation.
    The cost of this operation is the sum of all elements in the array present before this operation.
    Find the minimum cost to remove all elements from the array.*/
        public int solve(ArrayList<Integer> A) {
            A.sort(Comparator.reverseOrder());
            int sum = 0;
            int totalCost = 0;
            // for(Integer a : A){
            //      sum+= a;

            // }

            // for(Integer b : A){
            //     totalCost += sum;
            //             sum = sum-b;
            // }
            // return totalCost;

            for(int i = 0; i< A.size(); i++){
                totalCost = totalCost +  A.get(i) * (i + 1);
            }
            return totalCost;
        }

   /* Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
    A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
    */
   public int arithmeticProgression(ArrayList<Integer> A) {
       if(A==null || A.size()<= 2) return 1;
       Collections.sort(A);
       int diff = A.get(1) - A.get(0);
       for(int i = 2; i< A.size();i++){
           if(diff!=(A.get(i) - A.get(i-1))){
               return 0;
           }
       }
       return 1;


   }
    }

