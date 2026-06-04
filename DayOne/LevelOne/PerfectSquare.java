import java.util.ArrayList;
public class PerfectSquare{
public static void main(String[]args) {

    int[] numbers = {4, 7, 9, 10, 16, 18};

   perfectSquare(numbers);
}

public static void perfectSquare(int[] numbers) {
    ArrayList<Integer> perfectSquare = new ArrayList<>();

    for (int number : numbers){
       int root = (int)Math.sqrt(number);
       if (number == (root * root)){
            perfectSquare.add(number);
       }
    }

    System.out.println(perfectSquare);
}
