/*
Take the order of 2-D array and also the elements and print them.
*/

package lab.lab02;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the numbers of row and column of array:");
        int row = scn.nextInt();
        int col = scn.nextInt();
        
        int[][] arr = new int[row][col];

        System.out.println("Enter the "+ (row*col) + " elements of array:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print("arr["+i+"]"+"["+j+"]:");
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Displaying the elements of array:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        scn.close();
    } 
}
