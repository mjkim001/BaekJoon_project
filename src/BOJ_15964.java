import java.util.Scanner;

public class BOJ_15964 {
    public static void main(String[] args) {
        // A＠B = (A+B)×(A-B)
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println((a+b)*(a-b));
    }
}
