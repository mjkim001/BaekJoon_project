import java.io.IOException;
import java.util.Scanner;

public class BOJ_2743 {
    public static void main(String[] args) throws IOException {
        // 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.length());
    }
}
