package Third;

import java.util.Scanner;

// 암호 체크
// 암호는 대소문자를 구분합니다.
//
//- 암호(P)의 길이는 10에서 30 사이여야 합니다. 즉, 10 < = len(P) < = 30입니다. 당신의 프로그램 그렇지 않으면 종료됩니다.
//- 암호에는 숫자, 소문자, 대문자 및 특수 문자가 포함되어야 합니다.
//- 특수 문자는 !, %, _, #, &, +, -, *, /의 9개 문자 중 하나를 나타냅니다. (이중 1개는 포함되어야 한다)
//- 조건을 만족하면 “Good password!”, 만족하지 않으면 "Bad password!”
//- 사용자가 "종료"를 제공하면 프로그램 종료
public class normal15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckPWClass checkPW = new CheckPWClass();
        String password;
        while(true) {
            password = sc.next();
            if(password.equalsIgnoreCase("quit")) break;
            checkPW.inputPW(password);
        }
    }
}
