
class SpecificElementsInArray {

    public static void main(String[] args) {

        int[] inputArray = {77,78,77,65,65,77};
        String containString="";

        for(int i=0;i<inputArray.length;i++)
        {
            int arrayValues = inputArray[i];

            if(arrayValues==77 || arrayValues==65) {
                containString="true";
            }
            else {

                containString="false";
                break;
            }
        }
        System.out.println(containString);


    }

}
