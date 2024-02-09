package Fifth;

import java.util.Scanner;

// 문자열 비교
public class n15 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int cnt = 0;
    for (int i = 0; i < a.length(); i++) {
        if(a.charAt(i) == b.charAt(i)) {
            System.out.print(a.charAt(i));
            cnt++;
        } else break;
    }
    System.out.println();
    if(cnt != 0) System.out.println(cnt);
    else System.out.println("No CS");
}
}
