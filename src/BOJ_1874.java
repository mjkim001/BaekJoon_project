import java.util.Scanner;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();
        int start = 0;

        for(int i = 0; i < N; i++) {
            int value = sc.nextInt();

            if(value > start) {
                for(int j = start + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = value; 	// 오름차순을 유지하기 위해
            } else if(stack.peek() != value) { // top에 있는 원소가 입력받은 값과 같이 않은 경우
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}
