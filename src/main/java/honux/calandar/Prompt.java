package honux.calandar;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Prompt {

    private final String PROMPT = "cal> ";

    public static void main(String[] args) throws IOException {

        Prompt p = new Prompt();
        p.runPrompt();

    }

    public void runPrompt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


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
        int year = 0;
        while (month != -1) {

            System.out.println("년도를 입력하세요.");
            System.out.print("year> ");
            year = Integer.parseInt(br.readLine());

            System.out.println("달을 입력하세요.");
            System.out.print("cal> ");
            month = Integer.parseInt(br.readLine());

            System.out.println("첫번째 요일을 입력하세요.");
            System.out.print("weekday> ");
            String weekday = (br.readLine());

            System.out.println();

            if (month == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            Calendar cal = new Calendar();

            cal.printCalander2(year, month, weekday);
            System.out.println();
        }
    }



}
