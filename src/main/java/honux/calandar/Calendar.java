package honux.calandar;

public class Calendar {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        System.out.println(" 일 월 화 수 목 금 토");
        System.out.println("--------------------");
        for (int i = 1; i < 29; i++) {
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
