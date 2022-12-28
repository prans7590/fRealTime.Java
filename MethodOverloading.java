import java.lang.invoke.StringConcatException;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("this is String [] args main method");
        int b[] = new int[3];
        b[1] = 0;
        double c[] = new double[3];
        c[1] = 33.33;
        MethodOverloading.main(b);
        MethodOverloading.main(c);
    }

    public static void main(int[] a) {

        System.out.println("this is call by main String args ");
    }

    public static void main(double[] a) {
        System.out.println("this si double d ");
    }
}
