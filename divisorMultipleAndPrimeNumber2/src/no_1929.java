import java.io.*;
import java.util.StringTokenizer;

public class no_1929 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = N;i<=M;i++){
            if(findPrimeNumber(i)==0){
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();


    }
    private static long findPrimeNumber(long a){
        if(a < 2){
            return -1;
        }
        for(int i = 2;i*i<=a;i++){
            if(a%i==0){
                return -1;
            }
        }
        return 0;
    }
}