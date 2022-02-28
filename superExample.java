class rajesh {
    void print() {
        System.out.println("print");
    }
}

class maya extends rajesh {
    void display() {
        super.print();
    }
}

public class superExample {

    public static void main(String[] args) {
        maya obj = new maya();
        obj.display();

    }
}