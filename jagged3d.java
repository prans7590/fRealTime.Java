import java.util.*;

public class jagged3d {
    public static void main(String[] args) {
        int $3[][][] = new int[1][2][4];
        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < $3.length; i++) {
        // System.out.println("plz enter class number");
        // for (int j = 0; j < $3[i].length; j++) {
        // System.out.println("plz enter class number in digital number");
        // for (int k = 0; k < $3[i][j].length; k++) {
        // System.out.println("plz enter your Student Roll number");
        // $3[i][j][k] = sc.nextInt();
        // }
        // }
        // }
        // for (int i = 0; i < $3.length; i++) {
        // for (int j = 0; j < $3[i].length; j++) {
        // for (int k = 0; k < $3[i][j].length; k++) {
        // System.out.println("the clg +" + i + "the class" + j + " student rno " + k +
        // ":" + $3[i][j][k]);
        // }
        // }
        // }

        System.out.println("..............jagged ...............array.........");
        int $2[][][] = new int[1][2][];
        $2[0][0] = new int[2];
        $2[0][1] = new int[5];

        for (int i = 0; i < $2.length; i++) {
            System.out.println("clg detail " + i);
            for (int j = 0; j < $2[i].length; j++) {
                System.out.println("cls detail " + j);
                for (int k = 0; k < $2[i][j].length; k++) {
                    System.out.println("plz enter your Student Roll number");
                    $2[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < $2.length; i++) {
            for (int j = 0; j < $2[i].length; j++) {
                for (int k = 0; k < $2[i][j].length; k++) {
                    System.out.println("the clg +" + i + "the class" + j + " student rno " + k + ":" + $2[i][j][k]);
                }
            }
        }

    }

}
