import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체 생성

        System.out.println("점수를 입력하세요: "); // 사용자에게 입력을 요청하는 메시지 출력
        int score = scanner.nextInt(); // 키보드로부터 정수(사용자의 점수)를 읽어와 변수 score에 저장


        char grade; // 계산된 학점을 저장할 char 변수 선언

        // switch 문을 사용하여 학점 계산
        switch (score / 10) { // 사용자의 점수를 10으로 나눈 몫을 switch 문에 사용
            case 10:
            case 9:
                grade = 'A';  // 만약 점수가 9 또는 10이면 'A' 학점을 부여
                break;
            case 8:
                grade = 'B'; // 만약 점수가 8이면 'B' 학점을 부여
                break;
            case 7:
                grade = 'C'; // 만약 점수가 7이면 'C' 학점을 부여
                break;
            case 6:
                grade = 'D'; // 만약 점수가 6이면 'D' 학점을 부여
                break;
            default:
                grade = 'F'; // 만약 점수가 6 미만이면 'F' 학점(실패)을 부여
                break;
        }

        // 계산된 학점을 사용자에게 출력
        System.out.println("입력하신 점수 " + score + "는(은) 학점 " + grade + "입니다.");
    }
}
