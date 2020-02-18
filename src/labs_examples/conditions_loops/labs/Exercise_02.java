package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7 to determine the day of the week: ");
        int numDay = scanner.nextInt();

        if(numDay ==1){
            System.out.println("Today is Monday");

        }else if(numDay ==2){
            System.out.println("Today is Tuesday");

        }else if(numDay ==3){
            System.out.println("Today is Wednesday");

        }else if(numDay ==4){
            System.out.println("Today is Thursday");

        }else if(numDay ==5){
            System.out.println("Today is Friday");

        }else if(numDay ==6){
            System.out.println("Today is Saturday");

        }else if(numDay ==7){
            System.out.println("Today is Sunday");

        }else {
            System.out.println("You have not entered a number between 1 and 7");
                }

    }
}
