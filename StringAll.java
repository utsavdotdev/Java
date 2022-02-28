import java.lang.*;
import java.util.Scanner;
public class StringAll {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);


        // Simple method
        // String a1 = "h3llo";
        // Another Method to create string by object
        // String a2 = new String("Hi");
        // String buffer is slow
        // StringBuffer a3 = new StringBuffer("Tata");
        // String builder is fast
        // StringBuilder a4 = new StringBuilder("Byee");
        

        // System.out.println("Enter the String:");
        // String a=obj.nextLine();
        // boolean result = a.contains("Utsav");
        // if(result)
        // {
        //   System.out.println("Keyword Found!!");
        // }
        // else{
        //     System.out.println("Keyboard Not Found!!!");
        // }

        String a="H3llo guzys!";
        System.out.println(a.indexOf("l"));
    }
}
