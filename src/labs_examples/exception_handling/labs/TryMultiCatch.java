package labs_examples.exception_handling.labs;

public class TryMultiCatch {

    public static void main(String args[]) {
        int num1, num2;
        try {

            num1 = 0;
            num2 = 62 / num1;
            System.out.println(num2);
            System.out.println("Try Block Complete");
        }
        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero, this is BAD");
        }
        catch (Exception e) {

            System.out.println("Exception thrown");
        }
        System.out.println("Try/Catch/Catch Complete");
    }

}
