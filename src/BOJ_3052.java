import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_3052 {
    public static void main(String[] args) {
        // 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
        // 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            map.put((a%42),0);
        }
        System.out.println(map.size());
    }
}
