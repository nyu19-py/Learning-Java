package com.Learnjava;

public class methodsJava {
    static int checker(int d){
        return d*2;
    }
    public static void main(String [] args){
        int d = 64;
        int alpha = 64;
        for (int i =0; i<=8 ;i++){
            System.out.printf("%d > %d\n",d,checker(d));
            for(int j =0; j<i;j++){
                alpha += checker(d);
            }
            d=checker(d);
        }
        System.out.println(alpha);

    }
}
