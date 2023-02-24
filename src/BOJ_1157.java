import java.util.*;

public class BOJ_1157 {
    public static void main(String[] args) {
        // 알파벳 대소문자로 된 단어가 주어지면,
        // 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
        // 단, 대문자와 소문자를 구분하지 않는다.
        // 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim().toUpperCase();
        String[] arr = str.split("");

        Map<String, Integer> strMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if (!strMap.containsKey(arr[i])){ // 키값이 없을 경우 : 처음 만나는 알파벳일 경우
                strMap.put(arr[i],1);
            }else {
                strMap.put(arr[i],(strMap.get(arr[i]) + 1));
            }
        }

        int temp = 0;
        String result = "";

        for (Map.Entry<String,Integer> entrySet : strMap.entrySet()) {
            if(temp < entrySet.getValue()){
                result = entrySet.getKey();
                temp =  entrySet.getValue();
            } else if(temp == entrySet.getValue()) {
                System.out.println("?");
                return;
            }
        }
        System.out.println(result);
    }
}
