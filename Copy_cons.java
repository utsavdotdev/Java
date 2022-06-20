class stu {
    int id;
    String name;

    stu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    stu(stu ref) {
        id = ref.id;
        name = ref.name;
    }
}

public class Copy_cons {
    public static void main(String args[]) {
        stu obj1 = new stu(1, "utsav");
        stu obj2 = new stu(obj1);
        obj2.display();

    }
}
