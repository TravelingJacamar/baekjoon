import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;

public class no_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean tf = true;
        int cnt =1;
        while(st.hasMoreTokens()){
            int n = Integer.parseInt(st.nextToken());
            if(cnt == n){
                cnt++;
            }else{
                while(!stack.empty()&&stack.peek()==cnt){
                    stack.pop();
                    cnt++;
                }
                stack.push(n);
            }
        }
        while(!stack.empty()){
            if(stack.peek() == cnt){
                stack.pop();
                cnt++;
            }else{
                break;
            }
        }

        if(stack.empty()){
            bw.write("Nice");
        }else{
            bw.write("Sad");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
