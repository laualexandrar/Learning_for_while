package test;

import java.util.ArrayList;

public class LearningJAva {

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("result: ");


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr.length-1) {
                System.out.print(arr[i] + ", ");

            } else {
                System.out.print(arr[i]);
            }
        }
    }
}