package org.example;
import java.util.Scanner;

public class MagicNumber {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        System.out.println("Guess magic number");
        int nNumber= data.nextInt();
        if (nNumber ==35){
            System.out.println("🥳You won 1 millions🥳");

            }
 else if (nNumber>35){
                System.out.println("You are higher than the magic number");}

 else {System.out.println("You are Lower than the magic Number");}
            }
        }






