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
        System.out.println("0000000000000000000000");
        int k = 0;
        int l = 0;

        while (k <= 2) {

            while (l <= 2) {
                System.out.print("*");
                l++;

            }
            k++;
            System.out.println(" ");
            l = 0;

        }

    }

}