import java.io.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.StringTokenizer;

public class no_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        //map 으로 이름을 저장하고 카운트 해서 2인걸 출력한다...?
        //순환한번이니까 괜찮을듯
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> mapOfName = new HashSet<>();
        for(int i=0;i<N;i++){
            String n = br.readLine();
            mapOfName.add(n);
        }
        //둘다 포함되어있는 갯수 세기.
        int count =0;
        //둘다 속한 명단 treeSet으로 구현함으로써 오름차순 정렬이 되게 함.
        Set<String> bothContainName = new TreeSet<>();

        for(int i=0;i<M;i++){
            String tmp = br.readLine();
            if(mapOfName.contains(tmp)){
                count++;
                bothContainName.add(tmp);
            }
        }
        bw.write(count+"\n");
        for(String result : bothContainName){
                bw.write(result +"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
