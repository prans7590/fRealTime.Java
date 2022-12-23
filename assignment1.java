import javax.lang.model.util.ElementScanner14;

public class Pone {
    public static void main(String[] args) {
        System.out.println("Print letter B in  console");

        int n = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) / 2 ||
                        i == (n - 1) / 2 && j < (n - 1) / 2

                        || i == n - 1 && j < (n - 1) / 2 ||

                        j == (n - 1) / 2 && i > 0 && i != (n - 1) / 2 && i != n - 1 || j == 0

                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("Print letter p in  console");

        n = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) / 2 ||
                        i == (n - 1) / 2 && j < (n - 1) / 2
                        || j == (n - 1) / 2 && i < (n - 1) / 2 && i > 0

                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("print letter o");
        n = 7;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print(" ");

            for (int j = 0; j < n; j++) {
                if (j == n - 1 || j == 0 || i == j

                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 2 || i == n - 1

                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
