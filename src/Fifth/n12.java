package Fifth;
// 7자리 로또 번호 만들기
public class n12 {
    public static void main(String[] args) {
        int[] lotto = new int[7];
        for(int i = 0; i < 6; i++) {
            lotto[i] = (int)(Math.random() * 51);
        }
        lotto[6] = (int)(Math.random() * 51) + 50;
        for(int e : lotto) System.out.print(e + " ");
    }
}
