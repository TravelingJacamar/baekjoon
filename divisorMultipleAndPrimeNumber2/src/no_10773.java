import java.io.*;
import java.util.Stack;

public class no_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<k;i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp ==0){
                stack.pop();
            }else{
                stack.push(tmp);
            }
        }
        int sum = 0;
        while(!stack.empty()){
            sum += stack.pop();
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
