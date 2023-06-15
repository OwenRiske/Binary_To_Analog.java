package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] numLines = {"____", "| ", " |", "____", "| ", " |", "____"};
        String[] emptyLines = {"   ", "  ", "  ", "    ", "  ", "  ", "    "};
        Scanner INPUT = new Scanner(System.in);

        while (true) {
            System.out.print("4 digit binary\n>");
            String[] userInput = convert.splitNum(convert.binaryToNum(INPUT.nextLine()));

            for (int i = 0; i < userInput.length; i++) {


                if (Integer.valueOf(userInput[i])>10 || Integer.valueOf(userInput[i])!=0) {
                    if (Integer.valueOf(userInput[i])!=1 && Integer.valueOf(userInput[i])!=4) {
                        System.out.println(numLines[0]);
                    } else {
                        System.out.println(emptyLines[0]);
                    }
                    if (Integer.valueOf(userInput[i]) != 1 && Integer.valueOf(userInput[i]) != 2 && Integer.valueOf(userInput[i]) != 3 && Integer.valueOf(userInput[i]) != 7) {
                        System.out.print(numLines[1]);
                    } else {
                        System.out.print(emptyLines[1]);
                    }
                    if (Integer.valueOf(userInput[i]) != 5 && Integer.valueOf(userInput[i]) != 6) {
                        System.out.println(numLines[2]);
                    } else {
                        System.out.println(emptyLines[2]);
                    }
                    if (Integer.valueOf(userInput[i]) != 1 && Integer.valueOf(userInput[i]) != 7 && Integer.valueOf(userInput[i]) != 0) {
                        System.out.println(numLines[3]);
                    } else {
                        System.out.println(emptyLines[3]);
                    }
                    if (Integer.valueOf(userInput[i]) == 2 || Integer.valueOf(userInput[i]) == 6 || Integer.valueOf(userInput[i]) == 8 || Integer.valueOf(userInput[i]) == 0) {
                        System.out.print(numLines[4]);
                    } else {
                        System.out.print(emptyLines[4]);
                    }
                    if (Integer.valueOf(userInput[i]) != 2) {
                        System.out.println(numLines[5]);
                    } else {
                        System.out.println(emptyLines[5]);
                    }
                    if (Integer.valueOf(userInput[i]) != 1 && Integer.valueOf(userInput[i]) != 4 && Integer.valueOf(userInput[i]) != 7) {
                        System.out.println(numLines[6]);
                    } else {
                        System.out.println(emptyLines[6]);
                    }

                } else {
                    System.out.println(numLines[0] + "\n" + numLines[1] + numLines[2] + "\n" + emptyLines[3] + "\n" + numLines[4] + numLines[5] + "\n" + numLines[6]);
                }
            }
            System.out.println("\n\n\n");
        }
    }
}
