import java.io.*;
import java.util.Stack;
public class no_9012 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0;i<N;i++){
            Stack<Character> stack = new Stack<>();
            boolean tf = true;
            String str = br.readLine();
            char[] strArr = str.toCharArray();
            for(int j =0;j<str.length();j++){
                char ch = strArr[j];
                if(ch =='('){
                    stack.push(ch);
                }else {
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                }
            }
            if(stack.empty()){
                bw.write("YES\n");
            }else{
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
