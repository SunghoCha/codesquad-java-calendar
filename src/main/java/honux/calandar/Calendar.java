package honux.calandar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calendar {

    private final int[] maxDays = {31, 28, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};

    public int findMaxDay(int month){
        return maxDays[month-1];
        }

    public void printCalander(int year, int month) {

        int maxDay = findMaxDay(month);
        StringBuilder sb = new StringBuilder();

        System.out.printf ("     %4d년%2d월\n", year, month);
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
