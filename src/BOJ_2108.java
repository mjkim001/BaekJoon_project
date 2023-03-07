import java.util.Scanner;

public class BOJ_2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[8001];

        int sum = 0; //총 합계
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int median = 10000; //중앙값
        int mode = 10000; //최빈값

        for(int i = 0; i < N; i++) {
            int value = sc.nextInt();
            sum += value;
            arr[value + 4000]++;

            if(max < value) {
                max = value;
            }
            if(min > value) {
                min = value;
            }
        }

        int count = 0;
        int mode_max = 0;

        boolean flag = false;
        for(int i = min + 4000; i <= max + 4000; i++) {
            if(arr[i] > 0) {
                // 중앙값
                if(count < (N + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }

                // 최빈값
                if(mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if(mode_max == arr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int)Math.round((double)sum / N));	// 산술평균
        System.out.println(median);	// 중앙값
        System.out.println(mode);	// 최빈값
        System.out.println(max - min);	// 범위
    }
}
