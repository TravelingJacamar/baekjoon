import java.io.*;
import java.util.Set;
import java.util.HashSet;

public class no_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        Set<String> emo = new HashSet<>();
        for(int i =0;i<N;i++){
            String input = br.readLine();

            if(input.equals("ENTER")){
                count += emo.size();
                emo.clear();
            }else{
                emo.add(input);
            }
        }
        count += emo.size();

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();


    }
}
