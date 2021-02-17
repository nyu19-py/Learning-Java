package com.Learnjava;

public class logical {
    public static void main (String []args){
    int argument = 2;

        switch (argument) {
            case 1 -> System.out.println("1");
            case 2 -> {
                System.out.println("2");
                System.out.println("Test");
            }
            default -> System.out.println("default");
        }
    }
}
