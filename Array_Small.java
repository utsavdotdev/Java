public class Array_Small {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int first=a[0];
        for (int i=0;i<a.length;i++)
        {
          if(first<a[i])
          {
              first=a[i];
          }
        }
    }
}
