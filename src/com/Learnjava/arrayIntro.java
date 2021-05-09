package com.Learnjava;
public class arrayIntro {
    public static void main(String[] args){
        int []arr = {14,24,56,12,43,64};
        int []test = new int[6];
        int j = 0;

        for (int i = arr.length-1;i>=0;i--){
            test[j] = arr[i];
            j++;
        }
        for (int ele : test){
            System.out.println(ele);
        }
    }
}
