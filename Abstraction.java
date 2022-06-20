    
abstract class Animal
{
    abstract void print();
}
public class Abstraction extends Animal{
void print()
{
    System.out.println("Hello World!!");
}
public static void main(String args[])
{
    Animal obj= new Abstraction();
    obj.print();
} 
}