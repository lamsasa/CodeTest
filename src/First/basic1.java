package First;

// 한번에 정수 여러개 입력 받아서 합계 구하기 (입출력과 반복문)

import java.util.Scanner;

//**정수의 개수을 입력 받고 정수의 개수 만큼의 값을 입력 받아 총 합을 구하는 문제 입니다.**
//
//- 표준 입출력에 대한 사용 방법을 복습한다.
//- 여러개의 입력을 받기 위해서는 입력의 개수와 반복문이 필요한다.
//- 반복문의 기본적인 사용 방법을 복습 한다.
//- 합계를 구하기 위해서는 추가적인 변수가 필요하고 반드시 초기화 되어 있어야 한다.
public class basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수의 갯수를 입력 하세요 : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
        }
        System.out.println("sum : " + sum);
    }
}
