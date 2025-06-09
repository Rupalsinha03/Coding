package TwoDimensionalArray;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2,3},{1,2},{8,9,10,11}};
        System.out.println("Enter numbers:");

        System.out.println("\nMatrix:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "\t");  // Print with tab for better formatting
            }
            System.out.println();
        }

    }
}