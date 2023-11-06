// 사용자로부터 세 가지 필드 값을 입력받아 MyClass 객체의 필드에 저장하고,
// 그 값을 출력하는 간단한 Java 프로그램

class MyClass {
    private String field1; // MyClass의 private 멤버 변수 field1
    private String field2; // MyClass의 private 멤버 변수 field2
    private String field3; // MyClass의 private 멤버 변수 field3

    // MyClass의 생성자. 세 개의 문자열을 매개변수로 받아서 field1, field2, field3에 값을 설정한다.
    public MyClass(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    // MyClass의 멤버 변수 field1, field2, field3 값을 설정하는 메서드
    public void setFields(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    // MyClass의 멤버 변수 field1, field2, field3 값을 화면에 출력하는 메서드
    public void displayFields() {
        System.out.println("Field 1: " + field1);
        System.out.println("Field 2: " + field2);
        System.out.println("Field 3: " + field3);
    }
}
