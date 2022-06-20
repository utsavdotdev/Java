package Exam.Inheritance;
class a1{
    void data1(){
        System.out.println("Data 1 Fetched");
    }
}
class a2 extends a1{
    void data2(){
        System.out.println("Data 2 Fetched");
    }
}
public class Single {
    public static void main(String[] args) {
        a2 obj = new a2();
        obj.data1();
    }
    
}
