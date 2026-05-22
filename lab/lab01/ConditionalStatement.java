/*
Write a Java program to find whether user is eligible to vote or not by taking age as input from user.
*/

package lab.lab01;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age: ");
        //instead of int,using byte because byte(-127 to 127) only takes one byte of memory while, int takes 4
        byte age;  
        age = scn.nextByte();
        if(age > 18) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
        scn.close();
    }
    
}
