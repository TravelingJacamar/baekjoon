import java.io.*;

public class no_24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        //그림 그리며 계산해본 결과 마지막 줄의 2의 (박스 갯수) 제곱이라고 추정하였다.
        int result =1;
        for(int i =0;i<N;i++){
            result *= 2;
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();


    }
}
