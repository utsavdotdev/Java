package Exam.Inheritance;
interface a1{
     void data1();
}
interface a2{
    void data2();
}
class a3 implements a1,a2{
    public void data1(){
        System.out.println("Data 1");
    }
    public void data2(){
        System.out.println("Data 2");
    }

}
public class Multiple {
    public static void main(String[] args) {
        a3 obj = new a3();
        obj.data1();
        obj.data2();
    }
}
