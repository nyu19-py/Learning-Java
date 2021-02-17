package com.Learnjava;
import java.util.Scanner;
public class Scanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Testing Input form keyboard: ");
//        int num = sc.nextInt();
//        System.out.println("you Entered : " + num);
//
//        System.out.println("---------------");
//        System.out.println("Testing HasNextInt() : ");
//        boolean test = sc.hasNextInt();
//        System.out.println(test);
        System.out.print("Enter A Word : ");
        String str = sc.next();
        System.out.println(str);
        System.out.print("Enter A Line: ");
        String str1 = sc.nextLine();
        System.out.println(str1);

    }
}
