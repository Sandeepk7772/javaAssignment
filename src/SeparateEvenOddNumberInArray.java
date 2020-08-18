import java.util.*;

class SeparateEvenOddNumberInArray {

    public static void main(String[] args) {

        int[] inputArray = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};

        ArrayList<Integer> separateNumber = new ArrayList<Integer>();

        for(int i = 0; i < inputArray.length;i++) {

            int arrayValues1 = inputArray[i];

            if(arrayValues1 % 2 == 0)
            {
                separateNumber.add(arrayValues1);
            }
        }

        for(int i = 0; i < inputArray.length;i++) {

            int arrayValues2 = inputArray[i];

            if(arrayValues2 % 2 != 0)
            {
                separateNumber.add(arrayValues2);
            }
        }
        System.out.println(separateNumber);

    }
}
