package Exam.IOstream;
import java.io.*;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args) {
        try {
        File obj = new File("test.txt"); 
        boolean check = obj.createNewFile();
        if(check)
        {
            System.out.println("New File Created : " + obj.getName() );
        }
        else{
            System.out.println("File Exist");
        }
        
        } catch (Exception e) {
            System.out.println("Error Occurred");
        }
    }
}
