package oddNumbers;

public class oddNumbers {

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("result ");

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] % 2 != 0) {

                if (i < arr.length - 2) {

                    System.out.print(arr[i] + ", ");
                } else {
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
