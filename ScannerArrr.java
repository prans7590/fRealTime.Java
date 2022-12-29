import java.util.Scanner;

public class ScannerArrr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] a = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("plz enter your name");
            a[i] = sc.nextLine();

            System.out.println(a[i]);

        }
    }

}
