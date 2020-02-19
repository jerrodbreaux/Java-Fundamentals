package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 *
 */
public class Exercise_06 {

    public static void main(String[] args){

        int[] array1 = {3,4,5,6,7,8,9,10,11,12,13,14,15};
        //int temp;
        for(int i=0; i<array1.length/2; i++){       //begins at first element up to half of the indexes
            int temp = array1[i];                   //each pass, the element is given to the temp variable, in this case element "1"
            array1[i] = array1[array1.length -i -1];  //I phoned a friend here for guidance, need info on how variable pass values to other variables
            array1[array1.length -i -1] = temp;      //I phoned a friend here for guidance
                                                     //System.out.println(temp);
        }
                                                      //System.out.println(temp);
        for(int j : array1) {
            System.out.print(j + " ");
        }
    }
}
