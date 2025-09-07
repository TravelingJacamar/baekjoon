import java.io.*;
import java.util.StringTokenizer;

public class no_1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        // 분자 는 x 분모 는 y 로 표기함.
        int x1 =  Integer.parseInt(st1.nextToken());
        int y1 = Integer.parseInt(st1.nextToken());

        int x2 =  Integer.parseInt(st2.nextToken());
        int y2 = Integer.parseInt(st2.nextToken());

        // 일단 더하는 것 부터.
        int x3 = x1 * y2 + x2 * y1;
        int y3 = y1*y2;
        int divisor = euclidean(x3,y3);
        do{
            x3 = x3 / divisor;
            y3 = y3 / divisor;
            divisor = euclidean(x3,y3);
        }while(divisor != 1);

        bw.write(x3+" "+y3);
        bw.flush();
        bw.close();
        br.close();





    }
    public static int euclidean(int a,int b){
        if(a<b){
            int tmp = a;
            a=b;
            b=tmp;
        }
        int Q = a/b;
        int R = a%b;
        if(R == 0){
            return b;
        }else{
            return euclidean(b,R);
        }
    }
}
