public class Stringexample{
    public static void main(String args[]){
        StringBuffer a1=new StringBuffer("Stu");
        a1.append("dent");
        System.out.println(a1);

        StringBuilder a2=new StringBuilder("Utsavvv");
        a2.delete(5,7);
        System.out.println(a2);
    }
}