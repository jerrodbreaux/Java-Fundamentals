package labs_examples.objects_classes_methods.labs.objects;

/**
 * Created by ryandesmond - https://codingnomads.co
 * /
 * */

class CarExample {

    public static void main(String[] args){

        CarEngine myEngine = new CarEngine(400);

        Stereo myStereo = new Stereo("Panasonic");

        Car myCar = new Car(myEngine, myStereo, "Xterra", "Blue");

        System.out.println("I drive a " + myCar.color + " " + myCar.model + " with a "

                + myCar.stereo.brand + " stereo, and a " + myCar.engine.horsePower + " engine");

        // OR

        System.out.println(myCar.toString());

    }

}

class CarEngine {

    double horsePower;

    public CarEngine(double horsePower){

        this.horsePower = horsePower;

    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }
}

class Stereo {

    String brand;

    public Stereo(String brand){

        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Stereo{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

class Car {

    CarEngine engine;

    Stereo stereo;

    String model;

    String color;

    public Car(CarEngine engine, Stereo stereo, String model, String color){

        this.engine = engine;

        this.stereo = stereo;

        this.model = model;

        this.color = color;

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine.toString() +
                ",\n stereo=" + stereo.toString() +
                ",\n model='" + model + '\'' +
                ",\n color='" + color + '\'' +
                '}';
    }
}

