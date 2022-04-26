package edu.chintanpatel.tutorials.java;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter counter : ");
        int counter = input.nextInt();

        for (int i = 0; i < counter ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
