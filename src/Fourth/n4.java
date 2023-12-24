package Fourth;

import java.util.Scanner;

// [1]서울, [2]경기, [3]인천, [4]수원 으로 입력 받아 문자열로 출력 하기
public class n4 {
    public static void main(String[] args) {
        String[] city = {"", "서울", "경기", "인천", "수원"};
        Scanner sc = new Scanner(System.in);
        System.out.print("도시를 선택 하세요. [1]서울, [2]경기, [3]인천, [4]수원 : ");
        int num = sc.nextInt();
        System.out.println(city[num]);
    }
}
