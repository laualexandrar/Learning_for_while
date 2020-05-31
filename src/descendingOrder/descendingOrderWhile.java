package descendingOrder;

public class descendingOrderWhile {

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int i = 9;

        while(i >= 0){

            if(i > 0){
                System.out.print(arr[i] + ", ");
            }else {
                System.out.print(arr[i]);
            }
            i--;
        }
    }
}
