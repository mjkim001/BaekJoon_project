import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();	// 테스트 케이스

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            LinkedList<int[]> q = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                q.offer(new int[] { i, sc.nextInt() });
            }

            int count = 0;

            while (!q.isEmpty()) {
                int[] front = q.poll();
                boolean isMax = true;

                // 큐에 남아있는 원소들과 중요도를 비교
                for(int i = 0; i < q.size(); i++) {
                    if(front[1] < q.get(i)[1]) {
                        q.offer(front);
                        for(int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }
                        isMax = false;
                        break;
                    }
                }
                if(isMax == false) {
                    continue;
                }
                count++;
                if(front[0] == M) {	// 찾고자 하는 문서라면 해당 테스트케이스 종료
                    break;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
