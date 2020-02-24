package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Poly {

    public static void main(String[] args) {


        Cat cat = new Cat("Fluffy", 4, 6);
        System.out.println(cat.weight);
        //System.out.println(cat.printSound);

    }

}

class Animal{
    String name;
    int age;
    public void printSound(){

        System.out.println("Generic Animal Sound");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal{
    int weight;
    public void printSound(){

        System.out.println("Dog Sound");
    }

    public Dog(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }
}

class Cat extends Animal{
    int weight;
    public void printSound(){

        System.out.println("Cat Sound");
    }

    public Cat(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }
}




