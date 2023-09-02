package honux.calandar;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        while (month != -1) {
            System.out.println("달을 입력하세요.");
            System.out.print(PROMPT);
            month = Integer.parseInt(br.readLine());

            if (month == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            Calendar cal = new Calendar();

            System.out.println("======== V1 ========");
            cal.printCalander(2024,month);
            System.out.println("======== V2 ========");
            cal.printCalander2(2023,month);
            System.out.println();
        }


    }

}
