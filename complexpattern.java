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
        n = 4;
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
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
