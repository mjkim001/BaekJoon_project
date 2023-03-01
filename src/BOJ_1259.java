import java.util.Scanner;

public class BOJ_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            String str = sc.nextLine();
            if(str.equals("0")){
                break;
            }

            StringBuffer sb = new StringBuffer(str);
            String reversedStr = sb.reverse().toString();

            if(reversedStr.equals(str)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
