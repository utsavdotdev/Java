
class a1 {
    String a = "Tata";

    void f1() {
        System.out.println("H3llo!!");
    }

}

class a2 extends a1 {
    String a = "Byee!!";

    void f1() {
        System.out.println("H1");
    }

    void get() {
        super.f1();
        System.out.println("Output:" + super.a);
    }
}

public class Super_Example {
    public static void main(String args[]) {
        a2 obj = new a2();
        obj.get();
    }
}
