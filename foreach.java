public class foreach {

    public static void main(String[] args) {

        // foreach for 1d

        int j[] = { 3, 3, 3, 3, 3, 3, 33 };
        for (int el : j) {
            System.out.println(el);
        }

        // foreach for two 2d

        int arr[][] = { { 3, 3, 3, 3, 3 }, { 4, 4, 4, 4, 4 } };

        for (int a[] : arr) {
            for (int element : a) {

                System.out.print(element + " ");

            }
            System.out.println();
        }

        // foreach for 3d

        int a[][][] = new int[1][2][3];
        a[0][0][0] = 4;
        a[0][0][1] = 3;
        a[0][0][2] = 88;
        a[0][1][0] = 188;
        a[0][1][1] = 929;
        a[0][1][2] = 929;

        for (int i[][] : a) {
            for (int k[] : i) {
                for (int ele : k) {
                    System.out.print(ele);
                }
                System.out.println();

            }
        }

    }
}
