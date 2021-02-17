package com.Learnjava;
import java.util.Random;
import java.util.Scanner;
public class rockPaperScissors {
    public static void main (String []args){

        Random randomNumberGen = new Random();
        int newRandomNumber = randomNumberGen.nextInt(3);
        String compOut = "";
        switch (newRandomNumber){
            case 0 -> compOut = "R";
            case 1 -> compOut = "S";
            case 2 -> compOut = "P";
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to RPS Game..\nR = Rock, P = Paper, S = Scissor\nEnter Your Choice : ");
        String userInput = sc.next();

//        System.out.println(newRandomNumber);
//        0 = Rock , 1 = Scissor & 2 = Paper

        switch (userInput) {
            case "P" -> {
                if (compOut == "S") {System.out.println("I win L for you.."); }
                else if (compOut == "P") { System.out.println("Its a Tie!!"); }
                else { System.out.println("I lost ... F");}
            }
            case "R" -> {
                if (compOut == "S") { System.out.println("I Lost .. F"); }
                else if (compOut == "P") System.out.println("Lmao .. I win!");
                else System.out.println("Its a Tie!");
            }
            case "S"->{
                if (compOut == "P") System.out.println("I Won Bitch!!");
                else if(compOut == "R") System.out.println("Ouch! I Lost .. L");
                else System.out.println("Its A TIE!!!!");
            }

        }
    }
}
