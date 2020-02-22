package labs_examples.objects_classes_methods.labs.objects;


class Example {

    public static void main(String[] args){

        Engine myEngine = new Engine(470);

        Engine herEngine = new Engine(490);

        Engine hisEngine = new Engine(500);

        Avionics myAvionics = new Avionics("ARINC429");

        Avionics herAvionics = new Avionics("ARINC826");

        Avionics hisAvionics = new Avionics("ARINC744");

        Plane myPlane = new Plane(myEngine, myAvionics, "Cessna", "White", 1100, 900);

        Plane herPlane = new Plane(myEngine, myAvionics, "Gulf", "White", 1400, 8);

        Plane hisPlane = new Plane(myEngine, myAvionics, "Gulf", "Bone", 1600, 600);

        System.out.println("I fly a " + myPlane.color + " " + myPlane.model + " with "

                + myPlane.avionics.type + " avionics, and an engine with " + myPlane.engine.thrust + " pounds of thrust");

        // OR

        System.out.println(myPlane.toString());

    }

}

class Engine {

    double thrust;  //pounds

    public Engine(double thrust){

        this.thrust = thrust;

    }

    @Override
    public String toString() {
        return "Engine{" +
                "thrust=" + thrust +
                '}';
    }
}

class Avionics {

    String type;

    public Avionics(String type){

        this.type = type;

    }

    @Override
    public String toString() {
        return "Avionics{" +
                "type='" + type + '\'' +
                '}';
    }
}

class Plane {

    Engine engine;

    Avionics avionics;

    String model;

    String color;

    double fuelCapacity;

    double currentFuelLevel;

    public Plane(Engine engine, Avionics avionics, String model, String color, double fuelCapacity,double currentFuelLevel){

        this.engine = engine;

        this.avionics = avionics;

        this.model = model;

        this.color = color;

        this.fuelCapacity = fuelCapacity;

        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "engine=" + engine.toString() +
                ",\n avionics=" + avionics.toString() +
                ",\n model='" + model + '\'' +
                ",\n color='" + color + '\'' +
                '}';
    }
}
