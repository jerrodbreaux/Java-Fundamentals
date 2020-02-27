package labs_examples.exception_handling.labs;

public class TryCatch {


    public static void main(String[] args) {

        int[] nums = {88, 91};

        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Error detected.");
        }

        System.out.println("Program complete");

    }
}
