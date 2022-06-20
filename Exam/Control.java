package Exam;

public class Control {
public static void main(String[] args) {
    System.out.println("Continue: ");
    for (int i = 0; i < 10; i++) {
        if ( i == 3){
          continue;
        }
        System.out.println(i);
    }
    System.out.println("Break: ");

    for (int i = 0; i < 5; i++) {
        if (i == 3){
            break;
        }
        System.out.println(i);
        
    }
}
    
}