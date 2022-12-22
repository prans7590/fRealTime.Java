public class pattern {
    public static void main(String[] args) {
        // print pattern like this for loop and while loop
        // ******
        // ******
        // ******
        // ******

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int k = 0;

        while (k <= 2) {
            int l = 0;
            while (l <= 2) {
                System.out.print("*");
                l++;

            }
            k++;
            System.out.println(" ");
            // l = 0;

        }
        // print this pattern []

        System.out.println("-------------------");
        int n = 7;
        for (int s = 0; s < n; s++) {
            for (int t = 0; t < n; t++) {
                if (s == 0 || s == n - 1 || t == 0 || t == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");

        }
        // print this pattern 8

        System.out.println("");
        System.out.println("");

        n = 7;
        for (int s = 0; s < n; s++) {
            for (int t = 0; t < n; t++) {
                if (s == 0 || s == n - 1 || t == 0 || t == n - 1 || s == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

        // print this H
        System.out.println("");
        System.out.println("");

        n = 8;
        for (int s = 0; s < n; s++) {
            for (int t = 0; t < n; t++) {
                if (t == 0 || t == n - 1 || s == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");

        }

    }
}