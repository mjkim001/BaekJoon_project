import java.util.Scanner;

public class BOJ_4101 {
    public static void main(String[] args) {
        // 두 양의 정수가 주어졌을 때, 첫 번째 수가 두 번째 수보다 큰지 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0){
                break;
            }

            if(a > b){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
