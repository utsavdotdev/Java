package Exam;
import java.util.Scanner;

public class Switch {
    void add (int a,int b){
        int c=a+b;
        System.out.println("The Addition of " + a + " and " + b + " is " + c);
    }
    void sub (int a,int b){
        int c=a-b;
        System.out.println("The Subtraction of " + a + " and " + b + " is " + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Switch obj  = new Switch();
        System.out.println("Enter first numbers:");
        int a = sc.nextInt();
        System.out.println("Enter Second numbers:");
        int b = sc.nextInt();
        System.out.println("1: Addition");
        System.out.println("2. Subtraction ");
        System.out.println("Enter Your Choice:");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
            obj.add(a,b);
                break;
            case 2:
            obj.sub(a,b);
                break;
            default:
            System.out.println("Invalid Input");
        }


    }
}