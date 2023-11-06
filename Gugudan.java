import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        while (true) {
            System.out.print("원하는 구구단의 단 수를 입력하세요. (0 또는 1이면 종료) : ");

            // 사용자로부터 입력을 받기 위한 Scanner 객체 생성
            Scanner scanner = new Scanner(System.in);

            // 사용자가 입력한 문자열을 읽어옴
            String strX = scanner.nextLine();

            // 입력받은 문자열을 정수로 변환
            int dan = Integer.parseInt(strX);

            // 사용자가 0 또는 1을 입력하면 무한 루프(while (true))를 종료하고, 프로그램이 종료
            if (dan == 0 || dan == 1) break;

            // 구구단 계산과 출력을 위한 반복문
            for (int i = 1; i <= 9; i++) {

                // 구구단의 한 항목을 출력하고 줄바꿈
                System.out.printf("%2d * %2d = %2d\n", dan, i, dan * i);
            }
        }
    }
}
