package oddNumbers;

public class oddNumbersDescendingOrder {

        public static void main(String[] args) {
            int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int i = 9;
            System.out.print("The result is: ");

            while (i >= 0) {
                if (arr[i] % 2 != 0) {
                    if (i > 1) {
                        System.out.print(arr[i] + ", ");

                    } else {
                        System.out.print(arr[i]);

                    }

                }
                i--;
            }
        }
    }


