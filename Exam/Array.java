package Exam;

public class Array {
    //Function 1
    void arrayFuntion(String name[]){
        for (String i : name) {
            System.out.println(i);
        }
    }
 public static void main(String[] args) {

    // Simple Array
    // int a[] ={1,2,3,4,5,6};
    // for (int i = 0; i < a.length; i++) {
    //     System.out.println(a[i]);
    // }

    //Passing argument in function
    //Making Object
    Array obj = new Array();
     String name[] ={"Utsav","Pujan","Rajesh"};
     obj.arrayFuntion(name);

 }
    
}
