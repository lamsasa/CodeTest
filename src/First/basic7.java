package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//공백이 있는 문자열 입력받아 출력 하기
public class basic7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String test = br.readLine();
        System.out.println(test);
    }
}
