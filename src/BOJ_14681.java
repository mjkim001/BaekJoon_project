import java.util.Scanner;

public class BOJ_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= 0 && b>= 0){
            System.out.println(1);
            return;
        }
        if(a < 0 && b>= 0){
            System.out.println(2);
            return;
        }
        if(a < 0 && b < 0){
            System.out.println(3);
            return;
        }
        if(a >= 0 && b < 0) {
            System.out.println(4);
            return;
        }
    }
}
