import java.text.SimpleDateFormat;
import java.util.Date;

public class BOJ_10699 {
    public static void main(String[] args) {
        // 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
        System.out.print( new SimpleDateFormat("YYYY-MM-dd").format(new Date()));
    }
}
