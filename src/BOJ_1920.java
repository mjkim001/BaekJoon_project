import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            if(binarySearch(arr, sc.nextInt()) >= 0) {
                sb.append(1).append('\n');
            }
            else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    /**
     * @param arr 정렬 된 배열
     * @param key 찾으려는 값
     * @return key와 일치하는 배열의 인덱스
     */
    public static int binarySearch(int[] arr, int key) {
        int left = 0;					// 탐색 범위의 왼쪽 끝 인덱스
        int right = arr.length - 1;	// 탐색 범위의 오른쪽 끝 인덱스

        while(left <= right) { //왼쪽 끝 인덱스값이 오른쪽 끝 인덱스값보다 커지기 전까지
            int mid = (left + right) / 2;
            if(key < arr[mid]) {
                right = mid - 1;
            } else if(key > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
