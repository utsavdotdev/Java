package Exam;

import java.util.Scanner;

public class MultiDim_Array {
    void arrayFuntion(int a[][]) {
        System.out.println("Before Transpose:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("After Transpose:");
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultiDim_Array obj = new MultiDim_Array();

        int a[][] = new int[2][3];
        System.out.println("Enter the data:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // passing argument
        obj.arrayFuntion(a);
    }
}