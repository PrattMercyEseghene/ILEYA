import java.util.Array;
public class NonPerfectSquaredNumbers{
public static void main(String[]args) {

    int[] numbers = {4, 7, 9, 10, 49, 6};

   nonPerfectSquaredNumbers(numbers);
}

public static void nonPerfectSquaredNumbers(int[] numbers) {
    for (int i = 0; i < numbers.length; i++){
       int root = (int)Math.sqrt(numbers[i]);
       if (numbers[i] != (root * root)){
           numbers[i] = -1;
       }
    }

    System.out.println(Arrays.toString(numbers));
}
