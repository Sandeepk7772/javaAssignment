import java.util.*;


    class SegregationInArray {

    public static void main(String[] args) {

        int[] inputArray= {0,1,0,1,1,0,1,1,0,0,1};

        ArrayList<Integer>  segregationNumber=new ArrayList<Integer>();

        for(int i = 0; i < inputArray.length; i++) {
            int arrayValues1 = inputArray[i];
            if(arrayValues1==0)
            {
                segregationNumber.add(arrayValues1);
            }
        }
        for(int i = 0; i < inputArray.length; i++) {

            int arrayValues2 = inputArray[i];

            if(arrayValues2==1)
            {
                segregationNumber.add(arrayValues2);
            }
        }
        System.out.println(segregationNumber);

    }
}
