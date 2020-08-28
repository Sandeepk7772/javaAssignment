
import java.util.*;

public class AssociateValueAndKeyInTreeMap {
    public static void main(String args[]){

        TreeMap<Integer,String> inputColors = new TreeMap<Integer,String>();

        inputColors.put(1, "Red");
        inputColors.put(2, "Green");
        inputColors.put(3, "Black");
        inputColors.put(4, "White");
        inputColors.put(5, "Blue");

        for (Map.Entry<Integer,String> entry : inputColors.entrySet())
        {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }

}
