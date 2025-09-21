import java.io.*;

public class no_15439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        //기본적인 조합론
        int result = N*(N-1);
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();

    }

}
