import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.ArrayDeque;

public class no_24511 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        //해당 인덱스의 자료구조 입력받기
        int[] queueOrStack = new int[N];
        StringTokenizer second = new StringTokenizer(br.readLine());
        for(int i =0;i<N;i++){
            queueOrStack[i] = Integer.parseInt(second.nextToken());
        }
        //설명된 큐스택을 구현할 배열 다만 스택은 값의 변동을 주지 않음 즉 큐만 입력 받자.
        Queue<Integer> queue = new ArrayDeque<>();
        StringTokenizer third = new StringTokenizer(br.readLine());
        //이미 입력되어있는 것은 1 4 순서여야함으로 반복분 역으로돌림 인덱스를 위해
        int[] input = new int[N];
        for(int i=0;i<N;i++){
            input[i]=Integer.parseInt(third.nextToken());
        }
        for(int i =N-1;i>=0;i--){
            if(queueOrStack[i]==0) {
                queue.add(input[i]);
            }
        }

        int M = Integer.parseInt(br.readLine());
        //삽입할 수열
        StringTokenizer fifth = new StringTokenizer(br.readLine());
        //결과적으로 맨마지막에 있는거 pop 맨 앞에 push 니까
        for(int i =0;i<M;i++){
            int in = Integer.parseInt(fifth.nextToken());
            queue.add(in);
            bw.write(queue.poll()+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
