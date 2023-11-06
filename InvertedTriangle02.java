public class InvertedTriangle02 {
    public static void main(String[] args) {
        int rows = 5; // 역삼각형의 행 수를 설정, 이 경우 5행의 역삼각형을 만듭니다.

        // 역삼각형의 각 행을 생성하는 외부 루프
        for (int i = rows; i >= 1; i--) {
            // 별표(*)를 생성하는 내부 루프, i가 줄 수에 따라 감소하면서 별표를 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // 별표 출력
            }
            System.out.println(); // 한 행이 완료되면 줄을 바꿈
        }
    }
}
