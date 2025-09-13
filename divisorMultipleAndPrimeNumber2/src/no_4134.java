import java.io.*;
import java.io.IOException;

public class no_4134 {
    public static void main(String[] args) throws IOException {
        //long 형 써야할듯
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //입력의 수
        int N =Integer.parseInt(br.readLine());
        //입력 배열
        long[] arr = new long[N];
        for(int i =0; i<N;i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        // 소수 배열
        long[] prime = new long[N];
        // 해당 숫자보다 큰 수 중에 소수 찾기
        for(int i =0;i<N;i++){
            long tmp = arr[i];
            while(true){
                //시간 초과로 인해 짝수 거르기
                if(tmp%2!=0){
                    if(findPrimeNumber(tmp)==0){
                        prime[i] = tmp;
                        break;
                    } else{
                        tmp++;
                    }
                }else{
                tmp++;
            }

            }
        }
        for(int i = 0;i<N;i++){
            bw.write(prime[i]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
    private static long findPrimeNumber(long a){
        if(a < 2){
            return -1;
        }
        if(a ==2 || a == 3){
            return 0;
        }
        for(int i = 1;i*i<=a;i++){
            int tmp = 6*i-1;
            if(a%i==0){
                return -1;
            }
        }
        return 0;
    }
}
