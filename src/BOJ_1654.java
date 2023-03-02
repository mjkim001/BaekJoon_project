import java.util.Scanner;

public class BOJ_1654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int N = in.nextInt();

        int[] arr = new int[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = in.nextInt();
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        max++;

        long min = 0; 
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;

            long count = 0;
           
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }
            
            if(count < N) { // midFH 잘랐을 때 개수가 만들고자 하는 랜선의 개수보다 작을 경우
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }
        
        System.out.println(min - 1);
    }
}
