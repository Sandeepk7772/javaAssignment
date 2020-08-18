import java.util.*;

public class DuplicateValuesInArray {

    public static void main(String[] args) {

        int[] inputArray= {1,2,5,5,6,6,7,2};
        HashSet<Integer> newSetOfArray = new HashSet<Integer>();

        for(int i = 0; i < inputArray.length; i++)  {

            int arrayValues = inputArray[i];

            if(newSetOfArray.contains(arrayValues))
            {

                System.out.println("Duplicate Elements:"+arrayValues);

            }

            newSetOfArray.add(arrayValues);
        }

    }
}

