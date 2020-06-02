package test;

public class Review {

    public static void main(String[] args) {

        String arr[][] = new String[2][3];

        arr[0][0] = "Colombia";
        arr[0][1] = "Brazil";
        arr[0][2] = "Ecuador";
        arr[1][0] = "score";
        arr[1][1] = "score";
        arr[1][2] = "score";


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print("\n");
        }


    }
}