package SimpleStuff;

public class Overloading {
    public static void main(String[] args) {
        fun(5);
        fun("gogo");
    }

    public static void fun(int a){
        System.out.println(a);
    }

    public static void fun(String a){
        System.out.println(a);
    }
}
