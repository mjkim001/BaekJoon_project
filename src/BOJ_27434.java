import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_27434 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        BigInteger res = new BigInteger("1");

        for(int i = 1; i <= a / 2; i++) {
            res = res.multiply(BigInteger.valueOf(i*(a - i + 1)));
        }
        if(a % 2 != 0) res = res.multiply(BigInteger.valueOf(a/2 + 1));
        System.out.println(res);
    }
}
