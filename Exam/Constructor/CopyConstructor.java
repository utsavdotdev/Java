package Exam.Constructor;
class student{
    int id;
    String name;
    student(int id, String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+ " " +name);
    }
    student(student ref){
        id=ref.id;
        name=ref.name;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        student obj1 = new student(1,"Utsab");
        student obj2 = new student(obj1);
        obj2.display();
    }
}
