package twoDimenArray;

public class TwoDimenArray {

    public static void main(String[] args) {


        int arr[][] = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 4;
        arr[1][0] = 1;
        arr[1][1] = 2;
        arr[1][2] = 6;
        arr[2][0] = 1;
        arr[2][1] = 3;
        arr[2][2] = 8;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print("\n");
        }

//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//
//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[1][2]);
//
//        System.out.println(arr[2][0]);
//        System.out.println(arr[2][1]);
//        System.out.println(arr[2][2]);

    }
}

//   arr[0] = 1;
//
//           String cities[][] = new String[4][2]; // 4 renglones dos columnas ,
//
//           cities[0][0] = "colombia";
//           cities[0][1] = "medellin";
//           cities[1][0] = "colombia";
//           cities[1][1] = "Bogota";
//
//           System.out.println(cities[0][0]);
//           /*
//            * +-----------------------------+
//            * |  Country     |   City       |
//            * -------------------------------
//            * |  Mexico      |  CDMX        |
//            * |  Mexicop     |  Guadalajara |
//            * |  Colombia    |  Bogota      |
//            * |  Colombia    |  Medellin    |
//            * +-----------------------------+
//            *
//            */
//           int[][][] numbers = new int[2][2][2];
