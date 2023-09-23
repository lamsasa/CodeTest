package Sec;
//문자열 추가하기

import java.util.Scanner;

//2개의 문자열을 포인터 변수 s와 k에, 양의 정수를 정수형 변수 n에 각가 전달 받아 s 문자열의 뒤 부분의 n개 문자를 k문자열 앞에 끼워 넣는 코드 작성
//
//예)  s :  seoul
//
//       k :  korea
//
//       n :  2
//
//       result : ulkorea
public class normal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("s 문자열 입력 : ");
        String s = sc.nextLine();
        System.out.print("k 문자열 입력 : ");
        String k = sc.nextLine();
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();

        int pos = s.length() - n;
        String sub = s.substring(pos);
        System.out.println(sub + k);
    }
}
