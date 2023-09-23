package com.kristian.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        //Uppgift 1
        System.out.println("What's your name player #1?");
        String playerOne = sc.nextLine();
        System.out.println("Player #1: " + playerOne);

         */


        /*
        //Uppgift 2
        System.out.println("Enter a number");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            System.out.println("Loop #" + (i));
        }

         */

        /*
        //Uppgift 3
        do {

            System.out.println("This loop is infinite, write a number and try!");
            int infinity = sc.nextInt();
            System.out.println("This is loop #" + infinity);

        }while (true);

         */


        //Uppgift 4
        boolean isPlaying = true;

        do {

            System.out.println("If you wish to stop playing, write stop");
            Scanner scStopGame = new Scanner(System.in);
            String playerProgress = scStopGame.nextLine();

            if (playerProgress.equals("stop")){

                isPlaying = false;
            }

        }while (isPlaying);

        }

        }
