package org.example.loop.review;
import java.util.Scanner;


public class alone {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        System.out.println("Guess the magic number");
        int Number = data.nextInt();
        if (Number==24){
            System.out.println("🥳You WON 25 MILLION🥳");
        }
        else if (Number>24){
            System.out.println("You are higher than the number");}
            else {
                System.out.print("you have enter a smaller");
            }
        }


    }

// create a while loop you will ask the code to for the guess game
//if the number is getting close you will say your are getting close to the magic number
//number less than 10 but he going far you will say you are getting far
