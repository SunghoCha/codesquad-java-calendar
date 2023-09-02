package honux.calandar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calendar {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringBuilder sb = new StringBuilder();

//        System.out.println(" 일 월 화 수 목 금 토");
//        System.out.println("--------------------");
//        for (int i = 1; i < 29; i++) {
//            if (i < 10 && i % 7 == 0) {
//                sb.append(" ").append(i).append(" ").append("\n");
//            } else if(i < 10){
//                sb.append(" ").append(i).append(" ");
//            } else if(i > 10 && i % 7 == 0){
//                sb.append(i).append(" ").append("\n");
//            } else {
//                sb.append(i).append(" ");
//            }
//        }
//        String s = sb.toString();
//        System.out.println(s);

        int[] maxDays = {31, 28, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(br.readLine());
        System.out.println("달을 입력하세요");
        System.out.println(month + "월은 " + maxDays[month-1] + "일까지 있습니다.");
        System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDays[month-1]);





    }
}
