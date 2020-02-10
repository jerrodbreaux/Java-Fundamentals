package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {


        int a = 10;
        int b = 11;
        if (a < b){
            System.out.println("a is less than b");

            int c = a;
            boolean d = true;
            if (a < b){
                System.out.println("a is less than b");
            }

            if (b > a){
                System.out.println("b is greater than a");
            }
            if (a <= b){
                System.out.println("a is less than or equal to b");
            }
            if (b >= a){
                System.out.println("b is greater than or equal to a");
            }
            if (a == c){
                System.out.println("a is equal to c");
            }
            if (a != b){
                System.out.println("a is not equal to b");
            }
        }




    }

}

