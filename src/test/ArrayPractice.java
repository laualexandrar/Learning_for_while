package test;

public class ArrayPractice {
    public static void main(String[] args) {

        String countries[][] = new String[2][2];

        countries[0][0] = "Colombia";
        countries[0][1] = "Peru";
        countries[1][0] = "Mexico";
        countries[1][1] = "ecuador";

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries.length; j++) {
                System.out.print(countries[i][j]);
                System.out.print("\n");
            }

        }
    }
}
