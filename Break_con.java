public class Break_con {
    public static void main(String args[]) {
        System.out.println("Continue:");
        for (int i = 1; i < 8; i++) {
           
            if (i == 5)
                
            {
                continue;
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("Break:");
        for (int i = 1; i < 8; i++) {
           
            if (i == 5)
                
            {
                break;
            }
            else{
                System.out.print(i);
            }
        }

    }
}
