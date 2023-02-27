import java.util.Scanner;

public class BOJ_5597 {
    public static void main(String[] args) {
        // 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int[] student = new int[31];

        for(int i=1; i<29; i++) {
            int a = sc.nextInt();
            student[a] = 1;
        }
        for(int i=1; i<student.length; i++) {
            if(student[i]!=1)
                System.out.println(i);
        }
    }
}
