package Fourth;

import java.util.Scanner;

// 정해진 형식으로 시간을 입력 받아서 출력하기 (서식지정자)
public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String times = sc.next();
        String[] splitTime = times.split(":");
        int intHour = Integer.parseInt(splitTime[0]);
        int intMin = Integer.parseInt(splitTime[1]);
        int intSec = Integer.parseInt(splitTime[2]);

        if(intHour > 11) {
            intHour -= 12;
            System.out.printf("오후 %02d시 %02d분 %02d초\n", intHour, intMin, intSec);
        } else {
            System.out.printf("오전 %02d시 %02d분 %02d초\n", intHour, intMin, intSec);
        }
    }
}
