package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int irrArray[][] = {{56,83},{1209,2,765,107},{2,4,6,8,10}};

        for(int[] x : irrArray){
            for(int y : x) {
                System.out.print(y + " ");

            }
            System.out.println();
        }

    }

}
