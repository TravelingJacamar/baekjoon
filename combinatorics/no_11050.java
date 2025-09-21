import java.io.*;
import java.util.StringTokenizer;

public class no_11050 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //이항 계수
        int result = factorial(N)/(factorial(K)*factorial(N-K));
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
    private static int factorial(int num){
        int result = 1;
        for(int i =1;i<=num;i++){
            result *= i;
        }
        return result;
    }
}
