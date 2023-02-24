import java.util.Scanner;

public class BOJ_1330 {
    public static void main(String[] args) {
        // 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
        // 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
        // A가 B보다 큰 경우에는 '>'를 출력한다.
        // A가 B보다 작은 경우에는 '<'를 출력한다.
        // A와 B가 같은 경우에는 '=='를 출력한다.
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        String result = "";

        if (a > b)
            result = ">";
        else if (a < b)
            result = "<";
        else
            result = "==";

        System.out.println(result);
    }
}
