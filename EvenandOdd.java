void main() {

    int[] numbers = {45, 60, 3, 10, 9, 22};

    getEvenandOdd(numbers);
}

public static void getEvenandOdd(int[] numbers) {

    int[][] parentArry = new int[2][3];

    int[] oddArray = new int[3];
    int[] evenArray = new int[3];

    int evenIndex = 0;
    int oddIndex = 0;

    for (int number : numbers) {
        if (number % 2 == 0) {
            evenArray[evenIndex] = number;
            evenIndex++;

        } else {
            oddArray[oddIndex] = number;
            oddIndex++;
        }
    }

    parentArry[0] = oddArray;
    parentArry[1] = evenArray;

    IO.println(Arrays.deepToString(parentArry));
}
