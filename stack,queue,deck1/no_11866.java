import java.io.*;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class no_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> people = new ArrayDeque<>();
        //둘러 앉은 사람들 이라고 가정.
        for(int i =0;i<N;i++){
            people.add(i+1);
        }
        // 결과적으로 k의 배수자리에 있는 사람을 뽑아서 배열에 저장해보면 될듯.
        // 하지만 문제는 해당 번호의 것을 뽑은면 앞에 자리가 사라진다는것. 그렇다면 뒤로 넣는다
        int cnt =1;
        int target = k;
        bw.write("<");
        while(!people.isEmpty()){
            if(cnt==target){
                bw.write(""+people.poll());
                target += k;
                if(!people.isEmpty()){
                    bw.write(", ");
                }
            }else{
                int tmp = people.poll();
                people.add(tmp);
            }

            cnt++;
        }
        bw.write(">\n");
        bw.flush();
        bw.close();
        br.close();

    }
}
