import java.io.*;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class no_2346 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<idx> deque = new ArrayDeque<>();
        //입력 순서대로 deque 에 저장한다.
        for(int i=0;i<N;i++){
            int tmp = Integer.parseInt(st.nextToken());
            deque.addLast(new idx(i+1,tmp));
        }
        //오른쪽 왼쪽으로 돌리면 된다. 요세푸스 수열 풀때랑 비슷하게. 그때는 한방향 지금은 양방향.
        //다만 그때는 값 출력 이었는데 지금은 해당 번호이다.
        //idx 클래스를 사용해서 인덱스화를 해보자.
        while(!deque.isEmpty()){
            idx value = deque.pollFirst();
            if(deque.isEmpty()){
                bw.write(value.index+" ");
                break;
            }
            bw.write(value.index+" ");

            if(value.value>0){
                for(int i=0;i<value.value-1;i++){
                    deque.addLast(deque.pollFirst());
                }
            }else{
                value.value *= -1;
                for(int i=0;i<value.value;i++){
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static class idx{
        int index;
        int value;

        public idx(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
