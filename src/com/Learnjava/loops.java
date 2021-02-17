package com.Learnjava;

public class loops {
    public static void main(String[] args){
        int i = 1;
//        while (i <= 100){
//            System.out.print(i + " ");
//            if (i%10==0) System.out.println();
//            i++;
//        }
//        do {
//            System.out.println("umm");
//        }while(false);
        for(i=0 ; i<=10; i++){
            System.out.println(2*i);
        }
        for(i=0 ; i<=10; i+=2){
            System.out.println(2*i+1);
        }
    }
}
