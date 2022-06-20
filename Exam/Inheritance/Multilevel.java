package Exam.Inheritance;
class a1{
    void data1(){
        System.out.println("Data 1");
    }
}
class a2 extends a1{
    void data2(){
        System.out.println("Data 2");
    }
}
class a3 extends a2{
    void data3(){
        System.out.println("Data 3");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        a3 obj = new a3();
        obj.data1();
    }
    
}
