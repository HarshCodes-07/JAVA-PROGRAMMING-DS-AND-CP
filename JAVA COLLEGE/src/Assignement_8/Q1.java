package Assignement_8;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Elements in the array are:: ");
        System.out.println(Arrays.toString(myArray));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the required element ::");
        try {
            int element = sc.nextInt();
            System.out.println("Element in the given index is :: " + myArray[element]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you have entered is invalid");
            System.out.println("Please enter an index number between 0 and 9");
        }
    }
}