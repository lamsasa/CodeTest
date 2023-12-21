package Fourth;

import java.util.Scanner;

// 이름, 주소, 전화번호, 성별을 입력 받아 출력 하기
public class n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("주소를 입력하세요: ");
        String address = scanner.nextLine();

        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("성별을 입력하세요 (남성 또는 여성): ");
        String gender = scanner.nextLine();

        System.out.println("\n입력한 정보:");
        System.out.println("이름: " + name);
        System.out.println("주소: " + address);
        System.out.println("전화번호: " + phoneNumber);
        System.out.println("성별: " + gender);

        scanner.close(); // 입력 스트림 닫기
    }
}
