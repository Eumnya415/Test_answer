import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 사용자의 입력을 받기 위한 Scanner 객체 생성.

        // 사용자로부터 입력 받기 위한 프롬프트를 출력하고 입력값을 문자열 변수에 저장
        System.out.print("첫 번째 필드 값을 입력하세요: ");
        String field1 = scanner.nextLine();
        System.out.print("두 번째 필드 값을 입력하세요: ");
        String field2 = scanner.nextLine();
        System.out.print("세 번째 필드 값을 입력하세요: ");
        String field3 = scanner.nextLine();

        // MyClass의 인스턴스를 생성하고 초기화, 초기화 값은 모두 null로 설정.
        MyClass obj = new MyClass(null, null, null);

        // 입력된 값으로 MyClass의 멤버 변수 field1, field2, field3 값을 설정.
        obj.setFields(field1, field2, field3);

        // 설정된 필드 값을 출력.
        System.out.println("\n입력된 필드 값:");
        obj.displayFields();
    }
}