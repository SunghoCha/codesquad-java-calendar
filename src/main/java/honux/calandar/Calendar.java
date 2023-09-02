package honux.calandar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Calendar {

    private final int[] maxDays = {31, 28, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};
    private final int[] LeapMaxDays = {31, 29, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};

    public int findMaxDay(int year, int month){

        if (year%4 == 0 && year%100 !=0 || year%4 == 0 && year%400==0) {
            return LeapMaxDays[month-1];
        }
        return maxDays[month-1];
        }

    public void printCalander(int year, int month) {

        int maxDay = findMaxDay(year, month);
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

    public void printCalander2(int year, int month, String weekday) {

        int maxDay = findMaxDay(year, month);
        int week = parseDay(weekday);

        System.out.printf ("     %4d년%2d월\n", year, month);
        System.out.println(" 일 월 화 수 목 금 토");
        System.out.println("---------------------");

        for (int i = 0; i <week; i++) {
            System.out.printf("   ");
        }

        for (int i = 1; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if ((i+week)%7 == 0) {
                System.out.println();
            }
        }
    }

    public int parseDay(String week) {
        String[] array = {"su=0", "mo=1", "tu=2", "we=3", "th=4","fr=5", "sa=6"};

        Map<String, String> map = Arrays.stream(array)
                .map(i -> i.split("=", 2))
                .collect(Collectors.toMap(s -> s[0], s -> s[1]));

        return Integer.parseInt(map.get(week));
    }

}
