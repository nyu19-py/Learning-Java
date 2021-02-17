package com.Learnjava;
import java.util.Locale;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args){
        //Take users name and display it using printf(format specifier)
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        int a = 10;
//        float b = 5.2233f;
//
//        System.out.println("Hello There! " + name);
//        System.out.printf("Hey %s ! How Are You!!\n",name);
//        System.out.printf("%d + %f = %.2f",a,b,a+b);
        String New = "Hello World!";
        System.out.println(New.length());
        System.out.println(New.toUpperCase());
        System.out.println(New.toLowerCase());
        System.out.println(New.substring(6,12));
        System.out.println("Harry".replace('r','p'));
        System.out.println("Harry".repeat(3));
        System.out.println("Starts With Ha : "+ "Harry".startsWith("Ha"));//true
        System.out.println("Ends With rpy : "+"Harry".endsWith("rpy"));//false
        System.out.println ("equalsIgnoreCase : "+"Happier".equalsIgnoreCase("HAppiER"));




    }
}
