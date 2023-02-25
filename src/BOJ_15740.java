import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_15740 {
    public static void main(String[] args) {
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        String[] input =sc.nextLine().split(" ");
        BigInteger a =new BigInteger(input[0]);
        BigInteger b =new BigInteger(input[1]);
        System.out.print((a.add(b)));
    }
}
