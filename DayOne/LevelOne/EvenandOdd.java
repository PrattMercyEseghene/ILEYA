import java.util.Arrays;
public class EvenandOdd{
public static void main(String[]args) {

    int[] numbers = {45, 60, 3, 10, 9, 22};

    getEvenandOdd(numbers);
}

public static void getEvenandOdd(int[] numbers) {

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

    int[][] parentArry = {oddArray, evenArray};

    System.out.println(Arrays.deepToString(parentArry));
}

}
