package labs_examples.objects_classes_methods.labs.objects;


class Association {
    public static void main(String[] args){

        Human thisHuman = new Human ();
        Truck thisTruck = new Truck();

        thisHuman.name = "John";
        thisHuman.age = 24;
        thisHuman.weight = 220;

        thisTruck.setMake("Toyota");
        thisTruck.setModel("Tundra");
        thisTruck.setColor("Black");

        System.out.println(thisHuman.name + " would love to own a " + thisTruck.getColor() + " " + thisTruck.getMake() + " " + thisTruck.getModel());

        Truck ryanTruck = new Truck("Nissan", "Xterra", "Blue");
        System.out.println(ryanTruck.toString());

    }

}


class Human {

    String name;
    int age;
    int weight;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

class Truck {

    private String make;
    private String model;
    private String color;

    public Truck(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public Truck(){}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}