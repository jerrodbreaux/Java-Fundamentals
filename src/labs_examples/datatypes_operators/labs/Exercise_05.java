package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        int a = 10;
        int b = 11;
        int c = a;
        boolean d = true;
        boolean f = false;
        if (d | f){
            System.out.println("a or b is true");
        }


        if (a < 20 & b < 20){
            System.out.println("both a & b are less than 20");
        }
        if (a < 20 && b < 20){
            System.out.println("both a & b are less than 20");
        }
        if (a < 20 | b > 20){
            System.out.println("either a or b is true");

        }
        if (a < 20 || b == 20){
            System.out.println("either a or b is true");

        }
        if (a < 20 ^ b == 20){
            System.out.println("only a or b is true");

        }
        if (a < 20 && !d == false){
            System.out.println("both a and b are true");

        }// write your code below

    }

}

