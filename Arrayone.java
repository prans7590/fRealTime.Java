import java.util.Scanner;

public class Arrayone {

    public static void main(String[] args) {

        String a[] = new String[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("plz enter you name" + i);

            String s = sc.nextLine();
            a[i] = s;
            i++;

        }
        for (int j = 0; j < 3; j++) {
            System.out.println(a[j]);

        }

    }
}
