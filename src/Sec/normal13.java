package Sec;

import java.util.Scanner;

//세자리 정수를 입력 받아 가장 큰 수 출력하기
//각 자릿수에 해당하는 숫자는 num_split 함수를 사용하여 변수 a,b,c에 저장됩니다.
//comapre_num 함수를 사용하여 a,b,c 중 최대값을 찾습니다.
//최대값을 인쇄합니다.
public class normal13 {
    static int a, b, c;
    public static void num_split(int input) {
        a = input / 100;
        b = (input % 100) / 10;
        c = input % 10;
    }
    public static int compare_num() {
        if (a > b) {
            return Math.max(a, c);
        } else {
            return Math.max(b, c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        num_split(input);
        int result = compare_num();
        System.out.println(result);
    }
}
