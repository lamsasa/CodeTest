package Fourth;

import java.util.Scanner;

// 정수 n을 입력 받아 n * n 출력 하기
public class n6 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n * n; i++) {
            System.out.printf("%4d", i);
            if (i % n == 0) System.out.println();
        }
    }
}
