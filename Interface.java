
interface animal
{
    void bark();
}
interface insect{
    void fly();
}
class Multi implements animal,insect{
    public void bark()
    {
        System.out.println("Barking");
    }
    public void fly()
    {
        System.out.println("Flying");
    }
}
public class Interface
{
    public static void main (String[] args) {
      Multi obj = new Multi();
      obj.bark();
      obj.fly();
    }
}