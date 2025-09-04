import java.io.*;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class no_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //집합에 속하는 문자열의 수
        int N = Integer.parseInt(st.nextToken());
        //집합에 속하는지 알아봐야하는 문자열의 수
        int M = Integer.parseInt(st.nextToken());
        // 검사 후 속하는 문자열 갯수
        int cnt =0;

        //집합
        Set<String> sefOfStrings = new HashSet<>();
        for(int i = 0;i<N;i++){
            sefOfStrings.add(br.readLine());
        }
        for(int i= 0;i<M;i++){
            if(sefOfStrings.contains(br.readLine())){
                cnt++;
            }
        }

        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();



    }
}
