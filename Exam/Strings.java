package Exam;

public class Strings {
    public static void main(String[] args) {
        // Simple String
        String name1="Utsav";
        System.out.println(name1);

        //String Buffer
        StringBuffer name2 = new StringBuffer("Utsav Bhattarai");
        System.out.println(name2);

        //String Builder
        StringBuilder name3 = new StringBuilder("H3llo Hi");
        System.out.println(name3);

        //Difference beteen String Builder and Buffer
        // String Builder is fast
        // String Buffer is slow
        
        //Method in String
        String a1 = "Utsav";
        String a2 ="Hi";

        //To find Lenght
        System.out.println(a1.length());  // 5 
        //To UpperCase
        System.out.println(a1.toUpperCase()); // UTSAV
        //To Lowercase
        System.out.println(a1.toLowerCase()); // utsav
        //To find index
        System.out.println(a1.indexOf("a")); // 3 
        //To Concat the String
        System.out.println(a1.concat("Bhattarai")); // Utsav Bhattarai
        // To check if any charcter is present in the string or not
        System.out.println(a1.contains("v")); // true 
        //To check two string equal or not
        System.out.println(a1.equals(a2)); //false


        //Method of String Buffer and Builder
        StringBuilder a = new StringBuilder("H3llo");

        //To concat string
        System.out.println(a.append("Hi")); //H3llohi
        //To reverse the String
        System.out.println(a.reverse()); //iholl3h
        //To delete the string
        System.out.println(a.delete(0, 3)); //ll3h
        
        //The main difference between normal string method and string builder and buffer method is Normal string does not affect original value but builder and buffer affect the original string. Just see the output to understand it

    }
}
