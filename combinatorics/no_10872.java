import java.io.*;

public class no_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = factorial(N);
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
