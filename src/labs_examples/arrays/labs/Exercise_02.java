package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an element between 1 and 10: ");
        int element  = scanner.nextInt(); /// int element is now the element as entered

        int index = 0;

        for (int i =0; i<array.length; i++){

            if(array[i] == element){

                index = i;

            }

        }

        System.out.println("The index of element " + element + " is " + index);

    }
}