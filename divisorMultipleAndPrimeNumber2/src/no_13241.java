import java.io.*;
import java.util.StringTokenizer;

public class no_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //최소공배수와 최대공약수의 관계
        //두 수의 곱 / 최대공약수 == 최소공배수

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        bw.write((a*b)/euclidean(a,b)+"\n");


        bw.flush();
        bw.close();
        br.close();

    }
    /**
     * 최대공약수 구하기 유클리드 호제법 */
    public static long euclidean(long a,long b){
        if(a<b){
            long tmp = a;
            a=b;
            b=tmp;
        }
        long Q = a/b;
        long R = a%b;
        if(R ==0){
            return b;
        }else{
            return euclidean(b,R);
        }
    }
}
