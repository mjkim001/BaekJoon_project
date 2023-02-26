import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String[] args) {
        // 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
        // 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
        // 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for(int  i = 0; i < N; i++){
            int num = sc.nextInt();
            if(num < X){
                arr.add(num);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
