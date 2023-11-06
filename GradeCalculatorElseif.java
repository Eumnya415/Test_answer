import java.util.Scanner;

public class GradeCalculatorElseif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요: ");
        int score = scanner.nextInt();

        char grade; //  char. 이 변수는 사용자가 입력한 점수에 따라 계산된 성적을 저장하는 데 사용

        if (score >= 90 && score <= 100) {
            grade = 'A'; //score가 90보다 크거나 같고 100보다 작거나 같은지 확인. 이 조건이 true인 경우 grade변수는 'A'로 설정
        } else if (score >= 80 && score < 90) {
            grade = 'B';
            // 이전 조건이 거짓인 경우에만 실행되는 "else if" 문
            // score가 80보다 크거나 같고 90보다 작은 지 확인
            // 이 조건이 true인 경우 grade변수는 'B'로 설정

        } else if (score >= 70 && score < 80) {
            grade = 'C';
            // 점수가 70-79 범위에 속하는지 확인하고 true인 경우 'C'로 설정

        } else if (score >= 60 && score < 70) {
            grade = 'D';

        } else { // 이전 조건 중 어느 것도 충족되지 않으면 마지막 "else" 블록이 실행
            grade = 'F'; // 'F'를 할당하여 grade 실패를 나타냄
        }

        System.out.println("입력하신 점수 " + score + "는(은) 학점 " + grade + "입니다.");
    }
}