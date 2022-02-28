class student
{
    int id;
    String name;
    int age;
   
    student(int id,String name)
    {
    this.id=id;
    this.name=name;
    System.out.println("Id:"+id);
    System.out.println("Name:"+name);
    
    }
     student(int id,String name,int age)
    {
    this.id=id;
    this.name=name;
    this.age=age;
     System.out.println("Id:"+id);
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    
    }
   
}
public class Cons_Over
{
	public static void main(String[] args) {
	    student obj1 = new student(111,"Utsav");
	    student obj2 = new student(111,"Utsav",7);
	
	}
}
