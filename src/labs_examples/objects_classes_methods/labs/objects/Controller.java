package labs_examples.objects_classes_methods.labs.objects;

public class Controller {

    public static void main(String[] args) {

        Shoe myShoe1 = new Shoe ();
        Shoe myShoe2 = new Shoe (11,"EEEE", "White");
        Shoe myShoe3 = new Shoe ("new");

        System.out.println(myShoe1.condition + myShoe2.size + myShoe3.condition);
    }
}

class Shoe {

    int size;
    String width;
    String color;

    public Shoe(int size, String width, String color) {
        this.size = size;
        this.width = width;
        this.color = color;
    }

    Shoe(){}

    String condition;
    String top;


    public Shoe(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "size=" + size +
                ", width='" + width + '\'' +
                ", color='" + color + '\'' +
                ", condition='" + condition + '\'' +
                ", top='" + top + '\'' +
                '}';
    }
}