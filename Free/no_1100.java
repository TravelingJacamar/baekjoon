import java.io.*;
public class no_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //8*8 체스판 시작은 흰색 그럼 짝수 줄은 시작이 검은색
        char[] odd = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' };
        char[] even = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' };
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            String input = br.readLine();
            char[] inputLine = input.toCharArray();

            for (int j = 0; j < 8; j++) {
                if ((i + 1) % 2 == 0) {
                    if (even[j] == 'W' && inputLine[j] == 'F') {
                        cnt++;
                    }
                } else {
                    if (odd[j] == 'W' && inputLine[j] == 'F') {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}