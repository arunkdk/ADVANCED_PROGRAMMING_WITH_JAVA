/*
Write a simple Java program to add two numbers.
*/
package lab.lab01;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = 5;
        int num2 = 10;
        int sum1 = num1 + num2;
        System.out.println("The sum of pre defined numbers is " + sum1);
        System.out.println("Enter any two integer numbers: ");
        int num3 = scn.nextInt();
        int num4 = scn.nextInt();
        int sum2 = num3 + num4;
        System.out.println("The sum of user given numbers is "+ sum2);
        scn.close();
    }
}

