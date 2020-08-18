
    class PairsOfElementsInArray {

        public static void main(String[] args) {

            int[] inputArray = {2,7,4,-5,11,5,20};

            int specifiedNumber = 15;

            for(int i = 0; i <= inputArray.length/2;i++) {

                int loop1Number = inputArray[i];

                for (int j = 0; j < inputArray.length; j++) {

                    int loop2Number = inputArray[j];
                    int sumOfArrayValues = 0;

                    sumOfArrayValues = loop1Number + loop2Number;

                    if (specifiedNumber == sumOfArrayValues) {

                        System.out.println(loop1Number + "+" + loop2Number + "=" + sumOfArrayValues);

                    }
                }
            }
        }

    }
