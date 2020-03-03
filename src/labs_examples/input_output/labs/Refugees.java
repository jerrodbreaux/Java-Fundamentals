package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Refugees {


    static String filePath = "C:\\Users\\HP\\Documents\\CodingNomads\\refugees_per_capita.csv";

    public static void main(String[] args) throws IOException {

        ArrayList<Ref> unicorn = new ArrayList();
        unicorn = readData();

        int population = 0;
        double lowestRPC = 0;








    }

    public static ArrayList<Ref> readData() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        ArrayList<Ref> countries = new ArrayList<>();

        String val;


        br.readLine();
        while((val = br.readLine()) != null){
            Ref p = new Ref();
            String[] elements = val.split(",");

            try {
                p.id = Integer.parseInt(elements[0]);
                p.year = Integer.parseInt(elements[1]);
                p.country = elements[2];
                p.population = Double.parseDouble(elements[3]);
                p.refugees = Double.parseDouble(elements[4]);
                p.refpercap = Double.parseDouble(elements[5]);

                countries.add(p);
            }catch(Exception e){
                continue;
            }

        }
        return countries;
    }
}


