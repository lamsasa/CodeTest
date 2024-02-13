package Fifth;

import java.util.Scanner;

// 문자열 반전
//
//문자열을 입력으로 사용
//
//역기능으로 입력 문자열을 반전하여 출력합니다.
//
//역함수를 만들어야 한다.
public class n16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력 : ");
        String input = sc.next();
        for(int i = input.length()-1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }
}
