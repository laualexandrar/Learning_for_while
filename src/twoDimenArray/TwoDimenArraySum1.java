package twoDimenArray;

public class TwoDimenArraySum1 {

        public static void main(String[] args) {

            int numeros[][] = new int[3][3];
            int sum[][] = new int[3][3];
            int total[][] = new int[3][3];

            numeros[0][0] = 7;
            numeros[0][1] = 7;
            numeros[0][2] = 7;
            numeros[1][0] = 4;
            numeros[1][1] = 4;
            numeros[1][2] = 4;
            numeros[2][0] = 2;
            numeros[2][1] = 2;
            numeros[2][2] = 2;

            sum[0][0] = 6;
            sum[0][1] = 6;
            sum[0][2] = 6;
            sum[1][0] = 3;
            sum[1][1] = 3;
            sum[1][2] = 3;
            sum[2][0] = 1;
            sum[2][1] = 1;
            sum[2][2] = 1;

            total[0][0] = sum[0][0] + numeros[0][0];
            total[0][1] = sum[0][1] + numeros[0][1];
            total[0][2] = sum[0][2] + numeros[0][2];
            total[1][0] = sum[1][0] + numeros[1][0];
            total[1][1] = sum[1][1] + numeros[1][1];
            total[1][2] = sum[1][2] + numeros[1][2];
            total[2][0] = sum[2][0] + numeros[2][0];
            total[2][1] = sum[2][1] + numeros[2][1];
            total[2][2] = sum[2][2] + numeros[2][2];


            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length; j++) {

                    System.out.print(numeros[i][j]);

                }
                System.out.print("\n");
            }

            System.out.print("\n");

            for (int i = 0; i < sum.length; i++) {
                for (int j = 0; j < sum.length; j++) {

                    System.out.print(sum[i][j]);

                }
                System.out.print("\n");

            }

            System.out.print("\n");

            for (int i = 0; i < total.length; i++) {
                for (int j = 0; j < total.length; j++) {

                    System.out.print(total[i][j]);

                }
                System.out.print("\n");

            }
        }
    }

