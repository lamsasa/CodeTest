package Third;

import java.util.Scanner;

// 8진수 2진수
//## 문제
//
//8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
//
//## 입력
//
//첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
//
//## 출력
//
//첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
public class normal10 {
    public static void main(String[] args) {
        String[] bin1 = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String[] bin2 = {"", "1", "10", "11", "100", "101", "110", "111"};
        Scanner sc = new Scanner(System.in);
        String oct = sc.next();
        for(int i = 0; i < oct.length(); i++) {
            if(oct.length() == 1 && oct.charAt(0) - '0' == 0) {
                System.out.println("0");
                break;
            }
            if(i == 0) {
                System.out.print(bin2[oct.charAt(0)-'0']);
            } else {
                System.out.print(bin1[oct.charAt(i) - '0']);
            }
        }
    }
}
