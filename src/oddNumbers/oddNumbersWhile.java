package oddNumbers;

public class oddNumbersWhile {
    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;

        System.out.print("Result: ");

        while (i <= arr.length - 1) {

            if (arr[i] % 2 != 0) {
                if (i < arr.length - 2) {
                    System.out.print(arr[i] + ", ");
                } else {
                    System.out.print(arr[i]);
                }
            }
            i++;
        }
    }
}
