import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("삼각형의 총 행 수를 입력하세요: ");

        int rows = scanner.nextInt(); // 사용자로부터 총 행 수를 입력받음

        // 역삼각형의 각 행을 생성하는 외부 루프
        for (int i = rows; i >= 1; i--) {

            // 왼쪽에 공백을 생성하는 내부 루프, i가 줄 수에 따라 줄어들 때 공백을 생성
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // 공백 출력
            }

            // 별표(*)를 생성하는 내부 루프, i가 줄 수에 따라 증가하면서 별표를 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // 별표 출력
            }
            System.out.println(); // 한 행이 완료되면 줄을 바꿈
        }
    }
}