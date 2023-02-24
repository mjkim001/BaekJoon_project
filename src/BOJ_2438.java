import java.util.Scanner;

public class BOJ_2438 {
    public static void main(String[] args) {
        // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();

        String res = "";
        for(int i = 1; i <= a; i++){
            for(int j = 0; j < i; j++){
                res += "*";
            }
           res += "\n";
        }
        System.out.println(res);
    }
}
