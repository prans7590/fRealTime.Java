class a {
    int a;
    int b;

}

public class pp {
    public static void main(String[] args) {
        int x;

        int i = 0;
        for (int j = 0; j < 3; j++) {
            i = i + j;
            System.out.println(i);
        }
        System.out.println(args.length);

        int s = 20;
        final int y = 4;

        switch (y) {
            case 20: {
                System.out.println("This is case 20");
                break;
            }

            case y: {
                System.out.println("this is  case k ");
                break;
            }
        }

        int a = 5;
        System.out.println(a = a * 2);

    }
}
