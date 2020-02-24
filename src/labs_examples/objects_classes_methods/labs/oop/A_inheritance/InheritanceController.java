package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class InheritanceController {
    public static void main(String[] args) {

        Apartment myApartment = new Apartment(2100, 3, true, 3);
        Apartment yourApartment = new Apartment(3400, 4, true, 6);
        House yourHouse = new House(1900, 4, false);

        System.out.println(yourHouse.hasDriveway);
        System.out.println(yourApartment.sqfeet);
        System.out.println(yourApartment.numRooms);

    }


}

class Home{
    int sqfeet;
    int numRooms;
    public void distanceToTown(int miles){

        System.out.print("Home distance to town");

    }

    public Home(int sqfeet, int numRooms) {
        this.sqfeet = sqfeet;
        this.numRooms = numRooms;
    }

    @Override
    public String toString() {
        return "Home{" +
                "sqfeet=" + sqfeet +
                ", numRooms=" + numRooms +
                '}';
    }
}

class House extends Home{
    boolean hasDriveway;
    @Override
    public void distanceToTown(int miles){

        System.out.println("House distance to town");

    }

    public House(int sqfeet, int numRooms, boolean hasDriveway) {
        super(sqfeet, numRooms);
        this.hasDriveway = hasDriveway;
    }

    @Override
    public String toString() {
        return "House{" +
                "sqfeet=" + sqfeet +
                ", numRooms=" + numRooms +
                ", hasDriveway=" + hasDriveway +
                '}';
    }
}


class Apartment extends House{
    int floorNum;
    @Override
    public void distanceToTown(int miles){

        System.out.println("Apartment distance to town");

    }

    public Apartment(int sqfeet, int numRooms, boolean hasDriveway, int floorNum) {
        super(sqfeet, numRooms, hasDriveway);
        this.floorNum = floorNum;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "sqfeet=" + sqfeet +
                ", numRooms=" + numRooms +
                ", hasDriveway=" + hasDriveway +
                ", floorNum=" + floorNum +
                '}';
    }
}
