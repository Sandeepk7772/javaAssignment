
 class SumOfArrayValues {
    public static void main(String[] args) {
        int[] inputArray={2,5,4,8,7};
        int sumOfArray=0;

        for(int i=0; i<inputArray.length;i++){
            sumOfArray=sumOfArray+inputArray[i];
        }
        System.out.println("The sum is " + sumOfArray);
    }
}
