package Exam.IOstream;
import java.io.*;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("name.txt");
            file.write("H3llo");
            file.close();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
