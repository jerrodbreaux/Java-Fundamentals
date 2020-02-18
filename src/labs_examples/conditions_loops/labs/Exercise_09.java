package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args){
        int counter = 0;
        while(counter >= 1 || counter <=10){
            System.out.println("counter = " + counter);
            counter++;

            if (counter == 6) break;
        }



    }
}
