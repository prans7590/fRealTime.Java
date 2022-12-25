public class complexpattern {

    public static void main(String[] args) {

        int n = 10;

        // Write a program (WAP)to print INEURON using programming logic
        // 2 Write a program to print
        /*
         * 1111
         * 2222
         * 3333
         * 4444
         */
        n = 13;
        int num = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num + 1);
            }
            num++;

            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2 || j - i == (n - 1) / 2 || i - j == (n - 1) / 2 ||
                        i + j == n - 1 + (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n - 1 || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == (3 * n - 1) / 4 && j < (3 * n) / 4 && j > n / 4
                        || j == (3 * n - 1) / 4 && i < (3 * n) / 4 && i > n / 4 ||
                        i == 0 / 4 && j < (3 * n) / 4 && j > n / 4
                        || j == 0 / 4 && i < (3 * n) / 4 && i > n / 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
