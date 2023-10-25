package Sec;
// 7자리 로또 번호 만들기

// 7자리 로또 번호 만들기.
//배열을 정의하고 배열 요소의 값을 난수로 초기화합니다.
//첫 번째부터 여섯 번째 숫자는 0과 50 사이의 랜덤 값입니다. 마지막 숫자는 50에서 100 사이의 임의의 값인 보너스 번호입니다.
//7자리 로또를 인쇄하다
//배열을 사용해야 합니다.
public class normal17 {
    public static void main(String[] args) {
        int[] lotto = new int[7];
        for(int i = 0; i < 6; i++) {
            lotto[i] = (int)(Math.random() * 51);
        }
        lotto[6] = (int)(Math.random() * 51) + 50;
        for(int e : lotto) System.out.print(e + " ");
    }
}
