package com.Learnjava;
import java.util.Scanner;

public class test {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Length of the array: ");
        int n = 10;
        int even = 0, odd = 0;
        int []arr = new int[n];
        System.out.println("Enter the Elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        sc.close();
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);

    }
}