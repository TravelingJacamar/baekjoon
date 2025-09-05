import java.io.*;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class no_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        //첫번째 집합
        int N = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        //2번째 집합
        int M = Integer.parseInt(st1.nextToken());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> tmp = new HashSet<>();
        Set<Integer> finalSet = new HashSet<>();

        for(int i =0;i<N;i++){
            int tamp = Integer.parseInt(st2.nextToken());
            set1.add(tamp);
        }
        for(int i =0;i<M;i++){
            int tamp = Integer.parseInt(st3.nextToken());
            set2.add(tamp);
        }
        // 전체 합집합 - 교집합 == 대칭 차집합
        finalSet.addAll(set1);
        finalSet.addAll(set2);
        tmp.addAll(set1);
        tmp.retainAll(set2);
        finalSet.removeAll(tmp);

        bw.write(finalSet.size()+"");
        bw.flush();
        bw.close();
        br.close();


    }
}
