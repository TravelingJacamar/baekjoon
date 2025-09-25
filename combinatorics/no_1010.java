import java.io.*;
import java.util.StringTokenizer;

public class no_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //입력줄 갯수
        int num = Integer.parseInt(br.readLine());

        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long N = Integer.parseInt(st.nextToken());
            long M = Integer.parseInt(st.nextToken());
            //N이 M 보다 항상 작기 때문에 지을 수 있는 가장 많은 다리는 N 개이다.
            //즉 M 개 중에 N 개를 고르면 된다.
            //팩토리얼을 쓸 경우 수가 너무 커서 BigInteger를 사용하여함
            //그래서 팩토리얼을 쓰지 않는 계산법 적용
            long result =1;
            for(long j = 1;j<=N;j++){
                result = result * (M - j + 1);
                result = result / j;
            }
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
