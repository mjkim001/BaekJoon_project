import java.util.Scanner;

public class BOJ_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long res;

        res = Math.abs(a-b);

        System.out.println(res);
    }
}
