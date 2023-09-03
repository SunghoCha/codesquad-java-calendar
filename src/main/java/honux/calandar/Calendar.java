package honux.calandar;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Calendar {

    private final int[] maxDays = {31, 28, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};
    private final int[] leapMaxDays = {31, 29, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};

    public int findMaxDay(int year, int month){

        if (CheckLeapYear(year)) {
            return leapMaxDays[month-1];
        }
        return maxDays[month-1];
    }

    public boolean CheckLeapYear(int year) {
        if (year%4 == 0 && year%100 !=0 || year%4 == 0 && year%400==0){
            return true;
        } else {
            return false;
        }
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
    public void printCalander3(int year, int month) {

        int maxDay = findMaxDay(year, month);
        int week = getWeekday(year, month);

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

    public int getWeekday(int year, int month) {
        int stdWeekday = 3;

        return ((stdWeekday + (getYearAmount(year) + getMonthAmount(year,month))%7)%7+1)%7;
    }
    public int getYearAmount(int year) {
        int stdYear = 1970;
        int yearAmount = 0;

        for (int i = 1970; i < year; i++) {

            if (CheckLeapYear(i)) {
                yearAmount += 366;
            } else {
                yearAmount += 365;
            }
        }
        return yearAmount;
    }
    public int getMonthAmount(int year, int month) {

        int stdMonth = 1;
        int monthAmount = 0;

        if (CheckLeapYear(year)) {
            for (int i = 1; i < month; i++) {
                monthAmount += leapMaxDays[i-1];
            }
        } else {
            for (int i = 1; i < month; i++) {
                monthAmount += maxDays[i-1];
            }
        }
        return monthAmount;
//        return (stdWeekday + (yearAmount + monthAmount)%7)%7+1;
    }

}



