package Fifth;
//중복값이 없는 로또 번호 생성하기
// - 1부터 45사이의 6개의 수를 랜덤 함수를 이용해 생성하며 중복값이 발생하지 않도록 한다.
//- 참고 : vector 각 요소를 저장한 후 변동이 별로 없는 경우 효과적이고, 추가/삭제가 빈번하게 발생하는 경우는 list가 유리 합니다.
//- vsctor는 내부적으로는 배열 구조를 가지고 있습니다.
public class n2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int val, index = 0;
        boolean isExist = false;
        while(true) {
            val = (int)((Math.random() * 45) + 1);
            for (int i = 0; i < 6; i++) {
                if (lotto[i] == val) isExist = true;
            }
            if(!isExist) lotto[index++] = val;
            if(index == 6) break;
            isExist = false;
        }
        for(int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
    }
}
