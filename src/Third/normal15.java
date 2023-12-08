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

    // 암호 체크
    public class CheckPWClass {
        String password;
        void inputPW(String pass) {
            password = pass;
//        System.out.println("길이체크 : " + validLength());
//        System.out.println("숫자체크 : " + validNumber());
//        System.out.println("대문자체크 : " + validUpperAlphabet());
//        System.out.println("소문자체크 : " + validLowerAlphabet());
//        System.out.println("특수문자체크 : " + validRex());

            if(validLength() && validNumber() && validUpperAlphabet() &&
                    validLowerAlphabet() && validRex()) {
                System.out.println("Good password!");
            } else {
                System.out.println("Bad password!");
            }
        }

        boolean validLength() {
            if(password.length() >= 10 && password.length() <= 30) return true;
            else return false;
        }
        boolean validNumber() {
            for(int i = 0; i < password.length(); i++) {
                if(password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                    return true;
                }
            }
            return false;
        }
        boolean validUpperAlphabet() {
            for(int i = 0; i < password.length(); i++) {
                if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                    return true;
                }
            }
            return false;
        }
        boolean validLowerAlphabet() {
            for(int i = 0; i < password.length(); i++) {
                if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                    return true;
                }
            }
            return false;
        }
        boolean validRex() {
            String specialLetter = "!%_&#+-*/";
            for(int i = 0; i < specialLetter.length(); i++) {
                for(int j = 0; j < password.length(); j++) {
                    if(specialLetter.charAt(i) == password.charAt(j)) return true;
                }
            }
            return false;
        }
    }
}
