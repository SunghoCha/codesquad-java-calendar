package honux.calandar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calendar {

    private final int[] maxDays = {31, 28, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String PROMPT = "cal> ";

//        System.out.println("반복 횟수를 입력하세요.");

//        int N = Integer.parseInt(br.readLine());
//        for (int i = 0; i < N; i++) {
//            System.out.printf("달을 입력하세요 [%d/%d]\n", i,N);
//            System.out.print(PROMPT);
//            int month = Integer.parseInt(br.readLine());
//            Calendar cal = new Calendar();
//
//            System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.FindMaxDay(month));
//        }

        int month = 0;
        while (month != -1) {
            System.out.println("달을 입력하세요.");
            System.out.print(PROMPT);
            month = Integer.parseInt(br.readLine());

            if (month == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            Calendar cal = new Calendar();
            System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.FindMaxDay(month));
            cal.PrintCalander(cal.FindMaxDay(month));
        }


    }

    public int FindMaxDay(int month){
        return maxDays[month-1];
        }

    public void PrintCalander(int maxDay) {

        StringBuilder sb = new StringBuilder();

        System.out.println(" 일 월 화 수 목 금 토");
        System.out.println("--------------------");
        for (int i = 1; i <= maxDay; i++) {
            if (i < 10 && i % 7 == 0) {
                sb.append(" ").append(i).append(" ").append("\n");
            } else if(i < 10){
                sb.append(" ").append(i).append(" ");
            } else if(i > 10 && i % 7 == 0){
                sb.append(i).append(" ").append("\n");
            } else {
                sb.append(i).append(" ");
            }
        }
        String s = sb.toString();
        System.out.println(s);
    }
}
