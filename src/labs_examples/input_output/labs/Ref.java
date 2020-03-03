package labs_examples.input_output.labs;

public class Ref {

    int id;
    int year;
    String country;
    double population;
    double refugees;
    double refpercap;

    @Override
    public String toString() {
        return "Ref{" +
                "id=" + id +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", refugees=" + refugees +
                ", refpercap=" + refpercap +
                '}';
    }
}
