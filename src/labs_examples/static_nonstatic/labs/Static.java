package labs_examples.static_nonstatic.labs;

import labs_examples.static_nonstatic.examples.ClassA;
import labs_examples.static_nonstatic.examples.ClassB;

public class Static {

    public static void main(){


        staticMethod();

        Static thisClass = new Static();
        thisClass.nonStaticMethod1();
        int x = thisClass.nonStaticReturnMethod(2,3);

        NonStatic.staticMethod();

        NonStatic thatClass = new NonStatic();
        thatClass.nonStaticMethod();

    }

    public static void staticMethod(){
        System.out.println("Static staticMethod printing");
    }

    public void nonStaticMethod1(){
        System.out.println("Static nonStaticMethod1 printing");

    }

    public int nonStaticReturnMethod(int a, int b){
        System.out.println("Static nonStaticReturnMethod printing");
        return a * b;
    }
}


class NonStatic {

    public static void staticMethod(){

        System.out.println("NonStatic to static method printing");
    }

    public void nonStaticMethod(){

        System.out.println("Non-Static to  non-static method printing");
    }

    public static void staticMethod2(){

        System.out.println("Static Method from NonStatic Class");

    }

}