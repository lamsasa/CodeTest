package Fourth;

import java.util.Scanner;

// 입력 받은 n개의 원소에 대한 평균 구하기
// 첫번째 열에 입력 받을 숫자의 개수 :
//
//두번째 열에 공백 기준으로 첫번째 열에서 주어진 개수 만큼 성적 입력 (단 성적은 정수)
public class n2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 성적을 입력하시겠습니까? ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("성적 " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            sum += grade;
        }

        double average = (double) sum / n;

        System.out.println("입력한 성적들의 평균: " + average);
    }
}
