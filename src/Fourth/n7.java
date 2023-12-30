package Fourth;

import java.util.Scanner;

//알람 설정하기
public class n7 {
    public static void main(String[] args)  {
        int hour, min, calc;
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        hour = sc.nextInt();
        min = sc.nextInt();
        calc = (hour * 60) + min;
        if (calc < 45) {
            calc = (24 * 60) + min;
        }
        calc -= 45;
        System.out.printf("%d %d\n", (calc / 60), (calc % 60));
    }
}
