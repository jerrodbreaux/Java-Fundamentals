package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {

    public static void main(String[] args){
        int counter = 1003;

        do{counter -= 3;
        System.out.println("counter = " + counter);


        }while(counter >1 && counter<= 1000);


    }
}
