package Third;

import java.util.Scanner;

// 더하기 싸이클
// ## 문제
//
//0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
//
//26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
//
//위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//
//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
//
//## 입력
//
//첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
//
//## 출력
//
//첫째 줄에 N의 사이클 길이를 출력한다.
public class normal17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNumber = 0; // 입력받은 수의 10의 자리와 1자리를 분리해서 더함
        int newNumber = 0; // 새롭게 만들어진 수
        int cnt = 0; // 사이클 회수 누적
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int num = input; // 입력 받은 값이 변경되는 걸 막기 위해 임시 값을 만듬
        while (true) {
            sumNumber = (num / 10) + (num % 10); // 입력값을 10의 자리와 1자리로 분리해서 더함
            newNumber = (num % 10) * 10 + (sumNumber % 10); // 입력값의 1의 자리 + 계산된 값의 1자의 더함
            cnt++;
            if(newNumber == input) break; // 더하기 조건에 따라 1 Cycle 순회 후 입력 받은 값과 비교
            num = newNumber; // 순회를 위해 만들어진 값을 순회용 변수에 대입
        }
        System.out.println(cnt);
    }
}
