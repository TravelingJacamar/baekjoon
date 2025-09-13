import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class no_18258 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch(order){
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        bw.write("-1\n");
                    }else{
                    bw.write(queue.pollFirst()+"\n");}
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        bw.write("1\n");
                    }else{
                        bw.write("0\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(queue.peekFirst()+"\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(queue.peekLast()+"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
