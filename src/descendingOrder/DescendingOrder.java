package descendingOrder;

public class DescendingOrder {

        public static void main(String[] args) {


            int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.print("result: ");


            for (int i = arr.length-1; i >= 0 ; i--) {
                if(i > 0) {
                    System.out.print(arr[i] + ", ");
                }else {

                    System.out.print(arr[i]);
                }

            }
        }
    }

