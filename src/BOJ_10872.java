import java.util.Scanner;

public class BOJ_10872 {
    public static void main(String[] args) {
        // 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 1;
        while(N != 0) {
            res *= N;
            N--;
        }
        System.out.println(res);
    }
}
