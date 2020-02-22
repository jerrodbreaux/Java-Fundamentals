package labs_examples.objects_classes_methods.labs.methods;

//String vowels = "aeiou";
       // int count = 0;

       // while(count < str.length()){

       // char c = str.charAt(count);

       // if(vowels.indexOf(c) >= 0){

      //  System.out.println("The first vowel in " + str + " is " + c);
       // break;
      //  }
      //  count++;
      //  }


public class MethodTraining {

    public static void main(String[] args){




    int a = 73;
    int b = 20;
    int c = 30;
    int y = multiply(a,b); //pass by value
    int z = multiply(a,b,c); //pass by value

    prime(a);

    int maxA = 4;
    int maxB = 5;
    int maxC = 6;
    int maxD = 7;
    int higher = max(maxA, maxB, maxC, maxD);
    System.out.println(higher);

    System.out.println(y);
    System.out.println(z);
    Person person = new Person("Jerrod", 47);
    addYearToPerson(person);
    System.out.println(person.age);
    }

    public static int multiply(int a , int b) {
        return a * b;
    }

    public static int multiply(int a , int b, int c) {
        return a * b * c;
    }

    public static void addYearToPerson(Person person){

        person.age = person.age + 1;

    }

    public static int max(int a, int b, int c, int d){

        int max = a;

        if(b > max);
        max = b;

        if(c > max);
        max = c;

        if(d > max);
        max = d;

        return max;

    }

    public static void prime(int a) {

        if( a != 2 && a != 3 && a != 5){

            if(a % 2 != 0 && a % 3 != 0  && a % 5 != 0  ){

                System.out.println("Prime");

            }else {

                System.out.println("Not Prime");

            }

        }else{System.out.println("Prime");}
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}