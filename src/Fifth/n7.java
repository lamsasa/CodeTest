package Fifth;

import java.util.Scanner;

//입력 받은 수가 소수인지 아닌지 판별하기
//1과 자기자신이외에는 나누어지지 않는 수
public class n7 {
    public static void main(String[] args) {
        int n;
        System.out.print("정수를 입력 하세요 : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("소수 : " + func(n));
    }

    static boolean func(int n) {
        for (int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
