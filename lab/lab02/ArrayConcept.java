/*
Print the elements in array, initialized during compile time in Java
*/
package lab.lab02;

import java.util.Scanner;

public class ArrayConcept {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // pre-defined array
        int[] arr1 = {2, 4, 6, 8};
        // we can also define or initialize array as, int arr1[], but we prefer int[] arr1
        System.out.println("Elements in array are: ");
        for(int i = 0; i < arr1.length - 1; i++) {
            System.out.println(arr1[i]);
        }
        scn.close();
    }
}
