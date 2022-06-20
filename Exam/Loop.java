package Exam;

public class Loop {
    public static void main(String[] args) {
        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("H3llo");
        }

        //For Each
        String array[] = {"h3llo","hi","tata"};
        for ( String i : array) {
            System.out.println(i);
            
        }

        // While Loop
        int a=0;
        while (a<10) {
            a++;
            System.out.println(a);
            
        }

        //Do While
        int x=1;
        do {
            System.out.println(x);
            x++;
        } while (x<5);
    }
}
