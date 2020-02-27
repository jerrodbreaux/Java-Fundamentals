package labs_examples.exception_handling.labs;

public class TryCatchFinally {

    public static void main(String[] args) {

        int[] nums = {88, 91};

        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Error detected.");
        }finally{System.out.println("Finally block is always executed");}

        System.out.println("Program complete");

    }

}
