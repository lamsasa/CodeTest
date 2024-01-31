package Fifth;

public class Compare {
    static int a, b, c;

    public static void num_split(int input) {
        a = input / 100;
        b = (input % 100) / 10;
        c = input % 10;
    }

    public static int compare_num() {
        if (a > b) {
            return Math.max(a, c);
        } else {
            return Math.max(b, c);
        }
    }
}