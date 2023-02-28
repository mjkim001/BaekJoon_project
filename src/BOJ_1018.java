import java.util.Scanner;

public class BOJ_1018 {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true; // W = true
                } else {
                    arr[i][j] = false; // B = false
                }
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                setMin(i, j);
            }
        }
        System.out.println(min);
    }

    public static void setMin(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x][y];	// 첫 번째 칸의 색

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                // 올바른 색이 아닐경우 count 1 증가
                if (arr[i][j] != TF) {
                    count++;
                }
                TF = (!TF);
            }
            TF = !TF;
        }
        // 첫번쨰 칸 기준(count) & 첫번째 칸의 반대 색깔 기준(64-count) 중 작은것
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
