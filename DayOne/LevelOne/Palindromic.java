public void main() {

    int[] numbers = {45, 0, 8, 0, 45, 34};

    System.out.println(palindromic(numbers));
}

public static boolean palindromic(int[] numbers) {
    int left = 0;
    int right = numbers.length - 1;

    while (left < right){
        int leftNumber = numbers[left];
        int rightNumber = numbers[right];

        if (leftNumber != rightNumber){
            return false;
        }

        left++;
        right--;
    }

    return true;
}
