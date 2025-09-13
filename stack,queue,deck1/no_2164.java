import java.io.*;
import java.util.Queue;
import java.util.ArrayDeque;

public class no_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new ArrayDeque<>();
        for(int i =0;i<N;i++){
            cards.add(i+1);
        }
        while(cards.size()!=1){
            cards.poll();
            int tmp = cards.poll();
            cards.add(tmp);
        }

        bw.write(cards.poll()+"");
        bw.flush();
        bw.close();
        br.close();


    }
}
