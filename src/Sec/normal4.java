package Sec;
//주민등록번호를 입력받아 생년월일, 성별,나이 출력하기

import java.util.Calendar;
import java.util.Scanner;

//#include <time.h> //C언어
//#include <ctime> //C++
//
//// time() 함수를 호출하여 현재의 날짜, 시간을 업어 time_t 변수에 저장
//// time 함수는 time_t 결과값으로 타임을 리턴 합니다. 1970년 1월1일 0시0분0초 기준
//time_t timer = time(NULL);
//
//// localtime()함수를 호출하여 포맷 변환하기
//// time 함수가 리턴해주는 값은 시스템에 따라 32비트 또는 64비트 정수 입니다.
//// 이를 그대로 사용할 수 없기 때문에 tm 구조체를 활용해 원하는 형태로 변환 합니다.
//struct tm* t = localtime(&timer);
public class normal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar now = Calendar.getInstance();
        int thisYear = now.get(Calendar.YEAR);
        int intYear = 0;
        int intMonth = 0;
        int intDay = 0;
        int intGender = 0;

        System.out.print("주민등록번호를 입력 하세요 : ");
        String jumin = sc.next();

        for(int i =  0; i < jumin.length(); i++) {
            if (i == 0) intYear = (jumin.charAt(0) - '0') * 10;
            if (i == 1) intYear += jumin.charAt(1) - '0';
            if (i == 2) intMonth = (jumin.charAt(2) - '0') * 10;
            if (i == 3) intMonth += jumin.charAt(3) - '0';
            if (i == 4) intDay = (jumin.charAt(2) - '0') * 10;
            if (i == 5) intDay += jumin.charAt(3) - '0';
            if (i == 7) intGender = jumin.charAt(7) - '0';
        }

        if(intGender == 1 || intGender == 2) {
            System.out.println("생년월일 : " + (intYear + 1900) +"년" + intMonth + "월" + intDay + "일");
            System.out.println("나이 :  만 " + (thisYear - 1900 - intYear) + "세");
        } else {
            System.out.println("생년월일 : " + (intYear + 2000) +"년" + intMonth + "월" + intDay + "일");
            System.out.println("나이 :  만 " + (thisYear - 2000 - intYear) + "세");
        }

        String[] genderStr = {"", "남성", "여성", "남성", "여성"};
        System.out.println("성별 : " + genderStr[intGender]);

    }
}
