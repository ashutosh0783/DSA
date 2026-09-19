package org.example;

public class Factor {
    public static void main(String[] args) {
        System.out.println(solve(10));
    }

    public static int solve(int A) {
        int count =0;
        for(int i =1; (i*i)<=A; i++){
            if(A%i==0){
                if(i==A)count++;
                count = count + 2;
            }

        }
        return count;
    }


}
