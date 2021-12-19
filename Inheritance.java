class animal{
    void Eat()
    {
        System.out.println("Eating...");
    }
}
class dog extends animal{
    void Bark()
    {
        System.out.println("Barking..");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.Bark();
        obj.Eat();

    }
    
}
