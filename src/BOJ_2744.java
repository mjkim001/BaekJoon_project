import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BOJ_2744 {
    public static void main(String[] args) throws IOException {
        // 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)) {
                System.out.print(String.valueOf(ch).toLowerCase());
            } else {
                System.out.print(String.valueOf(ch).toUpperCase());
            }
        }
    }
}
