package Fifth;
// 10개의 배열에 중복된 문자 입력 후 2번째 숫자 찾기
import java.util.Scanner;
// 10개의 배열을 만들고 임의의 숫자를 입력 받음(가급적 중복된 숫자가 있도록 입력(1,2,3,4,5,6,1,3,4,5)
// 중복된 문자 중 두번째 나오는 숫자의 위치 찾기 (위치는 인덱스가 아니고 실질적인 위치를 의미)
// 만약 찾는 수가 없으면 -1
// 임의의 수 입력(10개) : 1 2 3 4 5 1 2 3 4 5
// 찾을 숫자 : 5
// 결과 : 10
public class n6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        System.out.print("임의의 수 입력 : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("두번째 찾을 수 입력 : ");
        int findNum = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == findNum) {
                cnt++;
                if(cnt == 2) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
        if(cnt < 2) System.out.println("-1");
    }
}
