package Sec;
// 7개의 수를 입력 받아 홀수와 짝수를 나누어서 출력

import java.util.Scanner;

// 7개의 정수를 입력 받아 홀수와 짝수를 각 배열에 나주어 저장 합니다.
//
//기존의 배열과 vector 구조의 차이를 이해 합니다.
//
//갯수 제한 없도록 수정 합니다.
public class normal5 {
    public static void main(String[] args) {
        Calc_func calc_func = new Calc_func();
        calc_func.inputInt();
        calc_func.oddEven();
        calc_func.dispOutput();
    }
}
class Calc_func {
    int[] arr = new int[7];
    int[] even = new int[7];
    int[] odd = new int[7];
    int e_idx = 0;
    int o_idx = 0;
    public void inputInt() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void oddEven() {
        for (int i : arr) {
            if (i % 2 == 0)  even[e_idx++] = i;
            else odd[o_idx++] = i;
        }
    }
    public void dispOutput() {
        System.out.println("홀수 : ");
        for (int i = 0; i < o_idx; i++) System.out.printf("%2d", odd[i]);
        System.out.println();
        System.out.println("짝수 : ");
        for (int i = 0; i < e_idx; i++) System.out.printf("%2d", even[i]);
        System.out.println();
    }
}
