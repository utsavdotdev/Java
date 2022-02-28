public class PassingArray {

    void a1(String[] array)
    {
     for(int i=0;i<array.length;i++)
     {
         System.out.println(array[i]);
     }
    }
 public static void main(String args[])
 {
   PassingArray obj = new PassingArray();
   String a[]={"Utsav","Pujan","Rajesh"};

   obj.a1(a);
 }
}
