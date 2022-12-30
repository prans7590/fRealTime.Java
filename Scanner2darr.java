import java.util.Scanner;

public class Scanner2darr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][4];

        for (int i = 0; i < a.length; i++) {
            System.out.println("enter you class Sec number in digit " + i);
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("enter you student age in digit" + j);

                a[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);

            }
        }

    }

}
