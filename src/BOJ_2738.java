import java.io.IOException;
import java.util.Scanner;

public class BOJ_2738 {
    public static void main(String[] args) throws IOException {
        // N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] arr1 = new int[x][y];
        int[][] arr2 = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
                if(j == y-1)
                    System.out.println();
            }
        }
    }
}
