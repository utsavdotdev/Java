package Exam.Function;

public class Overloading {
    void a(int a){
        System.out.println(a);
    }
    void a(int a,int b){
        System.out.println(a + " " + b);
    }
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.a(10);
        obj.a(10,20);
    }
}
