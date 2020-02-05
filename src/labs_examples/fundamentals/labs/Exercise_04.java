package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

            double cylR = 03.14;            // write code here
            short cylH = 8;
            double pi = 3.14159;
            double cylV = pi*cylR*cylR*cylH;
            double cylA1 = 2*pi*cylR*cylH;
            double cylA2 = 2*pi*cylR*cylR;
            double cylAT = cylA1+cylA2;
            System.out.println("The volume and area of a cylinder with a radius of 3.14 and a height of 8 is " + cylV + " and " + cylAT + " respectively.");



    }
}
