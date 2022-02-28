import java.util.Scanner;
public class SwitchFunction {
    void add(int a,int b)
    {
      int c=a+b;
      System.out.println("The Addition:"+c);
    }
    void sub(int a,int b)
    {
      int c=a-b;
      System.out.println("The Subtraction:"+c);
    }
    public static void main(String args[]) {
    Scanner obj=new Scanner(System.in);
    SwitchFunction s = new SwitchFunction();
    System.out.print("Enter first number:");
    int a=obj.nextInt();
    System.out.print("Enter second number:");
    int b=obj.nextInt();
    System.out.println("Enter choice:");
    int ch=obj.nextInt();
    switch(ch)
    {
        case 1:
        s.add(a,b);
        break;

        case 2:
        s.sub(a,b);
        break;

        default:
        System.out.println("Invalid Input");
    }      
    }
}
