import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[] nums =  new int[4];
        nums[0] = x;
        nums[1] = y;
        nums[2] = w-x;
        nums[3] = h-y;

        int min = Arrays.stream(nums).min().getAsInt();
        System.out.println(min);
    }
}
