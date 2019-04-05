package com.company;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //number of all available places
        int b = sc.nextInt(); //number of queue
        int c = 100;

        if (b < c-a) {

            System.out.println("Welcome!");
        } else {

            System.out.println("We are sorry, please, plan your visit to next time!");
        }

    }

}
