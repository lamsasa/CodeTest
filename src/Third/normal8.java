package Third;

import java.util.Scanner;

// 영화표 예매하기
// - 메뉴는 [1]예매하기, [2]종료하기
//- 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다. (좌석은 10개이다.)
//- [V] [V] [V] [  ] [  ] [  ] [  ] [  ] [  ] [  ]
//- 예매가 완료되면 해당 좌석 값을 1로 변경한다.
//- 이미 예매가 완료된 좌석은 재구매할 수 없다.
//- 한 좌석당 예매 가격은 12000원이다.
//- 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
public class normal8 {
    public void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1]예매하기");
            System.out.println("[2]종료하기");
            int selMenu = sc.nextInt();
            if(selMenu == 1) ticket.selectSeat();
            else {
                System.out.println(ticket.totalAmount());
                break;
            }
        }
    }

    public class MovieTicket {
        int seat[] = new int[10];

        int totalAmount() {
            int cnt = 0;
            for(int i = 0; i < seat.length; i++) {
                if(seat[i] == 1) cnt++;
            }
            return cnt * 12000;
        }
        void printSeat() {
            for(int i = 0; i < seat.length; i++) {
                if(seat[i] == 0) System.out.print("[ ]");
                else System.out.print("[V]");
            }
            System.out.println();
        }
        void selectSeat() {
            printSeat();
            Scanner sc = new Scanner(System.in);
            System.out.print("좌석 번호를 입력 하세요. : ");
            int seatPos = sc.nextInt();
            if(seat[seatPos-1] == 0) {
                seat[seatPos-1] = 1;
                printSeat();
            } else System.out.println("이미 예약된 좌석 입니다. 다른 좌석을 선택 하세요.");
        }
    }
}
