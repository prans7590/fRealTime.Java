import java.util.Scanner;

public class ScannerArrr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] a = new String[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("plz enter your name");
            a[i] = sc.nextLine();

            System.out.println(a[i]);

        }
    }

}
