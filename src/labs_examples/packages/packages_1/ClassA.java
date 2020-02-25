package labs_examples.packages.packages_1;

import labs_examples.static_nonstatic.examples.ClassB;

public class ClassA {

    public static void main(String[] args) {

        ClassA obj = new ClassA();

        obj.printA();
        obj.printProtectedA();



        printB();

    }

    private static void printB() {

    }


    public void printA(){

        System.out.println("Printing from method in ClassA");
    }

    protected void printProtectedA(){

        System.out.println("Printing from Protected method in ClassA");

    }
}
