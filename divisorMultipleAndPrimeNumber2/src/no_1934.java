import java.io.*;
import java.util.StringTokenizer;

public class no_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //최소공배수와 최대공약수의 관계
        //두 수의 곱 / 최대공약수 == 최소공배수
        int T = Integer.parseInt(br.readLine());
        for(int i =0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((a*b)/euclidean(a,b)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
   /**
    * 최대공약수 구하기 유클리드 호제법 */
    public static int euclidean(int a,int b){
        if(a<b){
            int tmp = a;
            a=b;
            b=tmp;
        }
        int Q = a/b;
        int R = a%b;
        if(R ==0){
            return b;
        }else{
             return euclidean(b,R);
        }
    }
}
