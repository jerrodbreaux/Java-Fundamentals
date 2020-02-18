package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter an integer larger than the previous: ");
        int num2 = scanner.nextInt();
        int sum = ((num1 + num2) / 2)*(num2 - num1 + 1);
        int n = num2 - num1 + 1;


        if(num2 <= num1){System.out.println("Your 2nd integer must be greater than the first...Start Over");


        }else{System.out.println("The sum is: " + sum);System.out.println("The average is: " + (sum/n));

        }





    }

}
