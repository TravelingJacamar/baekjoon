import java.io.*;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class no_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //상근이가 가진 카드에 값을 Key 로 Value 는 카운트로 하여서 풀면 될듯.

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        //상근이가 가진 카드
        Map<Integer,Integer> cards = new HashMap<>();
        for(int i = 0;i<N;i++){
            int new_card = Integer.parseInt(st.nextToken());
            if(!cards.containsKey(new_card)){
                cards.put(new_card,1);
            }else{
                cards.put(new_card,cards.get(new_card)+1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i=0;i<M;i++){
            int tmp = Integer.parseInt(st2.nextToken());
            if(cards.containsKey(tmp)){
                bw.write(cards.get(tmp)+" ");
            }else{
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
