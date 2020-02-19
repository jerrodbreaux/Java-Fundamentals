package labs_examples.arrays.labs;
import java.util.ArrayList;
/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args){


       ArrayList<String> aList = new ArrayList();

       aList.add ("This");
       aList.add ("is");
       aList.add ("an");
       aList.add ("ArrayList");

       String firstWord = aList.get(0);
       System.out.println(firstWord);

        System.out.println(aList);

        int size = aList.size();
        System.out.println(size);


    }
}
