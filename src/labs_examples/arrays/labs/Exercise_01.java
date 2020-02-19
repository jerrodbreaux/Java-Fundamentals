package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //opened scanner
        int[] array = new int[10];                   //declared and initialized array with 10 elements
        double sum = 0;


        System.out.println("Enter 10 integers:"); //prompt user for input

        for (int i=0; i<10; i++)                  //populate the array with user inputs
        {
            array[i] = scanner.nextInt();          //populate the array with user inputs
        }
        for( double num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
        double average = sum / array.length;
        System.out.println("Average of array elements is:"+average);

    }






}