package com.kristian.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Uppgift 1
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name player #1?");
        String playerOne = sc.nextLine();
        System.out.println("Player #1: " + playerOne);


        //Uppgift 2
        System.out.println("Enter a number");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            System.out.println("Loop #" + (i + 1));
        }





        }



    }
