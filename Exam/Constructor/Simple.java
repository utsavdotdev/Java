package Exam.Constructor;
class student{
    student(int id,String name){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
    student(int id,String name,String Address){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Address:"+Address);
    }
}
public class Simple {
    public static void main(String[] args) {
        student obj1 = new student(1,"Utsav");
        student obj2 = new student(1,"Utsav","Butwal");
    }
}
