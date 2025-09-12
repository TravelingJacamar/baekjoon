import java.io.*;

public class no_4948 {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean run = true;

        while(run){
            int count =0;
            int input = Integer.parseInt(br.readLine());
            if(input==0){
                run = false;
                continue;
            }
            for(int i = input+1;i<=input*2;i++){
                if(findPrimeNumber(i)==0){
                    count++;
                }
            }
            bw.write(count+"\n");
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
