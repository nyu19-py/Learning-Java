package com.Learnjava;

public class recursionInJava {
    public static int factorial(int ...arr){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;

    }
    public static void main(String[] arg){
        int x = 0 ;
        System.out.println(factorial(1,23,5223,12,1,3,4));
    }
}
