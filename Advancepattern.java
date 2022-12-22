import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;
import javax.swing.SpinnerDateModel;

public class Advancepattern {
    public static void main(String[] args) {
        System.out.println("000000000000");
        int n = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i != 0 || i == 0 && j != 0 && j < (n - 1) / 2 ||
                        i == (n - 1) / 2 && j <= (n - 1) / 2 ||
                        j == (n - 1) / 2 && i != 0) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

        System.out.println("we are trying to print D");
        n = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < n - 1
                        || j == 0 ||
                        i == n - 1 && j < n - 1
                        || j == n - 1 && i > 0 && i < n - 1

                ) {
                    System.out.print("D");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        // Printing o letter

        System.out.println("today task is to print 0 letter in english");

        n = 15;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");

        }

    }
}