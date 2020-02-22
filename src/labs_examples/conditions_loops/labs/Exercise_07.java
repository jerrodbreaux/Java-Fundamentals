package labs_examples.conditions_loops.labs;


import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hint: there is a helpful method in the String class called charAt() that you'll want to use
 *
 */

public class Exercise_07 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        System.out.println(str);

        String vowels = "aeiou";
        int count = 0;

        while(count < str.length()){

            char c = str.charAt(count);

            if(vowels.indexOf(c) >= 0){

                System.out.println("The first vowel in " + str + " is " + c);
                break;
            }
            count++;
        }
    }


}
