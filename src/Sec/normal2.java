package Sec;
//n개에 대한 숫자를 입력 받아 최소값 및 최대값 구하기


import java.util.Scanner;

public class normal2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (min > i) min = i;
            if (max < i) max = i;
        }
        System.out.println("MIN : " + min);
        System.out.println("MAX : " + max);
    }
}
