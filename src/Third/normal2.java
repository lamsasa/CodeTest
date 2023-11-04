package Third;
// 핸드폰 요금

import java.util.Scanner;

//## 문제
//
//동호는 새악대로 T 통신사의 새 핸드폰 옴머나를 샀다. 새악대로 T 통신사는 동호에게 다음 두 가지 요금제 중 하나를 선택하라고 했다.
//
//1. 영식 요금제
//2. 민식 요금제
//
//영식 요금제는 30초마다 10원씩 청구된다. 이 말은 만약 29초 또는 그 보다 적은 시간 통화를 했으면 10원이 청구된다. 만약 30초부터 59초 사이로 통화를 했으면 20원이 청구된다.
//
//민식 요금제는 60초마다 15원씩 청구된다. 이 말은 만약 59초 또는 그 보다 적은 시간 통화를 했으면 15원이 청구된다. 만약 60초부터 119초 사이로 통화를 했으면 30원이 청구된다.
//
//동호가 저번 달에 새악대로 T 통신사를 이용할 때 통화 시간 목록이 주어지면 어느 요금제를 사용 하는 것이 저렴한지 출력하는 프로그램을 작성하시오.
//
//## 입력
//
//동호가 저번 달에 이용한 통화의 개수 N이 주어진다. N은 20보다 작거나 같은 자연수이다. 둘째 줄에 통화 시간 N개가 주어진다. 통화 시간은 10,000보다 작거나 같은 자연수이다.
//
//## 출력
//
//첫째 줄에 싼 요금제의 이름을 출력한다. 그 후에 공백을 사이에 두고 요금이 몇 원 나오는지 출력한다. 만약 두 요금제의 요금이 모두 같으면 영식을 먼저 쓰고 민식을 그 다음에 쓴다.
//
//영식은 Y로, 민식은 M으로 출력한다.
public class normal2 {
    public static void main(String[] args) {
        int[] call = new int[20];
        int yPay = 0, mPay = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("통화 횟수 입력 : ");
        int n = sc.nextInt();
        System.out.println("통화 시간 입력 : ");
        for(int i = 0; i < n; i++) {
            call[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            yPay += (call[i] / 30) * 10 + 10;
            mPay += (call[i] / 60) * 15 + 15;
        }
        if(yPay > mPay) {
            System.out.println("M " + mPay);
        } else if(yPay < mPay) {
            System.out.println("Y " + yPay);
        } else {
            System.out.println("Y M " + yPay);
        }

    }

}
