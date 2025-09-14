import java.io.*;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class no_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            switch(order){
                case 1:
                    int tmp = Integer.parseInt(st.nextToken());
                    deque.addFirst(tmp);
                    break;
                case 2:
                    int temp = Integer.parseInt(st.nextToken());
                    deque.addLast(temp);
                    break;
                case 3:
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(deque.pollFirst()+"\n");
                    }
                    break;
                case 4:
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(deque.pollLast()+"\n");
                    }
                    break;
                case 5:
                    bw.write(deque.size()+"\n");
                    break;
                case 6:
                    if(deque.isEmpty()){
                        bw.write("1\n");
                    }else{
                        bw.write("0\n");
                    }
                    break;
                case 7:
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(deque.peekFirst()+"\n");
                    }
                    break;
                case 8:
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(deque.peekLast()+"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
