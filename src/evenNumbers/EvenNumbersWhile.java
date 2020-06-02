package evenNumbers;

public class EvenNumbersWhile {

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("result: ");

        int i = 0;

        while (i <= arr.length - 1) {
            if (arr[i] % 2 == 0) {


                if (i < arr.length - 1) {
                    System.out.print(arr[i] + ", ");
//                    i++ ;

                } else {
                    System.out.print(arr[i]);
//                    i++;
                }
            }
            i++;
        }
    }
}
//}
