public class Static_var_mth {
    static int id;
    String name;
    static String scl = "Kalika";

    static void dis() {
        System.out.println("Details:");
    }

    Static_var_mth(String name) {
        id++;
        this.name = name;
        System.out.println("Id:" + id + " " + "Name:" + name + " " + "School:" + scl);
    }

    public static void main(String args[]) {
        dis();
        Static_var_mth obj1 = new Static_var_mth("Utsav");
        Static_var_mth obj2 = new Static_var_mth("Rajesh");
        Static_var_mth obj3 = new Static_var_mth("Pujan");

    }
}
