void main() {

    int[] numbers = {4, 7, 9, 10, 49, 6};

   perfectSquare(numbers);
}

public static void nonPerfectSquaredNumbers(int[] numbers) {
    for (int i = 0; i <= numbers.length - 1; i++){
       int root = (int)Math.sqrt(numbers[i]);
       if (numbers[i] != (root * root)){
           numbers[i] = -1;
       }
    }

    System.out.println(Arrays.toString(numbers));
}
