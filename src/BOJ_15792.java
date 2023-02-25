import java.util.Scanner;

public class BOJ_15792 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print((a/b) + ".");

        a = a % b;
        for (int i = 0; i <= 1000; i++)
        {
            a *= 10;
            System.out.print((a/b));
            a = a - (a / b)*b;
        }
    }
}
