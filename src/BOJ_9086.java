import java.util.Scanner;

public class BOJ_9086 {
    public static void main(String[] args) {
        // 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0 ; i < N ; i++) {
            String a = sc.next();
            int l = a.length();
            String fist = String.valueOf(a.charAt(0));
            String end = String.valueOf(a.charAt(l-1));
            System.out.println(fist+end);
        }
    }
}
