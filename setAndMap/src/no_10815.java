import java.io.*;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;
public class no_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 상근기가 가질 카드의 갯수
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        // 상근이가 가지고 있는 지 확인해야 하는 카드의 갯수
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 다음의 제공된 카드들의 소유 여부를 정할 것임으로 중복된 데이터가 필요하지 않음 즉 집합 set을 사용한다.
        // 상근이 가지고 있는 카드의 중복되지 않은 집합.
        Set<Integer> sangun = new HashSet<>();
        for(int i =0;i<N;i++){
            sangun.add(Integer.parseInt(st1.nextToken()));
        }

        //상근이 가지고 있는지 확인해야하는 배열
        for(int i=0;i<M;i++){
            int tmp = Integer.parseInt(st2.nextToken());
            if(sangun.contains(tmp)){
                bw.write("1 ");
            }else{
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
