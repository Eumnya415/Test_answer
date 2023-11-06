// 작성 날짜 : 2023.11.03.
// 작성자 : 차소영
// 랜덤 함수를 이용, 다섯 가지 난수를 출력하여 1차원 배열 입력 후 최대, 최소, 중심값을 출력하는 프로그램

package Test;

import java.util.Random;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        // 배열의 크기를 정의
        int arraySize = 5;
        int[] numbers = new int[arraySize]; // 무작위 숫자를 저장할 배열을 생성

        // 무작위 숫자를 생성하기 위한 Random 클래스의 인스턴스를 생성
        Random random = new Random();

        // 배열에 무작위 숫자를 생성하고 저장
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(100); // 0부터 99까지의 무작위 숫자를 생성
        }

        // 배열을 출력하여 생성된 무작위 숫자를 표시
        System.out.println("배열: " + Arrays.toString(numbers));

        // 최댓값, 최솟값, 중심값을 계산하기 위한 변수를 초기화
        int max = numbers[0]; // 첫 번째 요소로 최댓값을 초기화
        int min = numbers[0]; // 첫 번째 요소로 최솟값을 초기화
        int sum = 0; // 배열의 모든 요소의 합을 계산하기 위해 초기화

        // 배열을 반복하면서 최댓값, 최솟값, 합을 계산
        for (int number : numbers) {
            sum += number; // 현재 숫자를 더함

            // 현재 숫자가 현재 최댓값보다 큰지 확인
            if (number > max) {
                max = number; // 조건이 참이면 최댓값을 업데이트
            }

            // 현재 숫자가 현재 최솟값보다 작은지 확인
            if (number < min) {
                min = number; // 조건이 참이면 최솟값을 업데이트
            }
        }

        // 평균 (중심값)을 계산
        int avg = sum / arraySize;

        // 최댓값, 최솟값, 중심값을 출력
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
        System.out.println("중심값 (평균): " + avg);
    }
}
