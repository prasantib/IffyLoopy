package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String answer;
        String yes = "yes";
        String no = "no";
        boolean redEyes = true;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Are your eyes red?");
        answer = keyboard.next();
while (true) {
    if (answer.equalsIgnoreCase("yes") ){
        System.out.println("Get some sleep!");
        break;
    } else {
        System.out.println("You look great!");
        break;
    }
}
    }
}