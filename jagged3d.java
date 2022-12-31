import java.util.*;

public class jagged3d {
    public static void main(String[] args) {
        int $3[][][] = new int[1][2][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < $3.length; i++) {
            System.out.println("plz enter class number");
            for (int j = 0; j < $3[i].length; j++) {
                System.out.println("plz enter class number in digital number");
                for (int k = 0; k < $3[i][j].length; k++) {
                    System.out.println("plz enter your Student Roll number");
                    $3[i][j][k] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < $3.length; i++) {
            for (int j = 0; j < $3[i].length; j++) {
                for (int k = 0; k < $3[i][j].length; k++) {
                    System.out.println("the clg +" + i + "the class" + j + " student rno " + k + ":" + $3[i][j][k]);
                }
            }
        }

    }

}
