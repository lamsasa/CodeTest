package Fifth;

import java.util.Scanner;

import static Fifth.Compare.compare_num;
import static Fifth.Compare.num_split;

//세자리 정수를 입력 받아 가장 큰 수 출력하기
//각 자릿수에 해당하는 숫자는 num_split 함수를 사용하여 변수 a,b,c에 저장됩니다.
//comapre_num 함수를 사용하여 a,b,c 중 최대값을 찾습니다.
//최대값을 인쇄합니다.
public class n11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        num_split(input);
        int result = compare_num();
        System.out.println(result);
    }
}
