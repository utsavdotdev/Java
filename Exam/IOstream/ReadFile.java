package Exam.IOstream;
import java.io.*;
import java.io.IOException;
public class ReadFile {
    public static void main(String[] args) {
        try {
            char[] data = new char[100];
            FileReader file = new FileReader("name.txt");
            file.read(data);
            System.out.println(data);

            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}