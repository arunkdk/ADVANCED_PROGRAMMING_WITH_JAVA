/*
Take the length of 1-D array from user also take elements and print them.
*/
package lab.lab02;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the length of array: ");
        int size = scn.nextInt();

        int[] arr = new int[size]; 

        System.out.println("Enter the elements of array");
        for(int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = scn.nextInt();
        }
        
        System.out.println("Displaying the elements of array:");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        scn.close();
    }
}
