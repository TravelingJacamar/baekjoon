import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        //정렬시키고 처음이랑 마지막거 곱할 것이다.
        for(int i =0;i<num;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int N = arr[0]*arr[arr.length-1];

        bw.write(N+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
