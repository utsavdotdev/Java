
import java.util.Scanner;
public class Sum_3d {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[3][3];
        int sum = 0;
        System.out.println("Enter the element:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Elements are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "");
            }
            System.out.println("");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum = sum + a[i][j];
            }

        }
        System.out.println("Sum:"+sum);

    }
}
