package com.Learnjava;

public class MultiDimensional {
    public static void main (String[] args){
        int [][] flats;
        flats = new int[3][2];
        int ex = 300;
        for (int i=flats.length-1;i>=0;i--){
            for (int j = flats[i].length-1;j>=0;j--){
                System.out.print(ex+j + " ");
            }
            System.out.println();
            ex -= 100;
        }
    }
}
