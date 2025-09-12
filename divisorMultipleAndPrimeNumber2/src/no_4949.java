import java.io.*;
import java.util.Stack;
public class no_4949 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        do{
            Stack<Character> stack = new Stack<>();
            boolean tf = true;
            char[] strArr = str.toCharArray();
            for(int j =0;j<str.length();j++){
                char ch = strArr[j];
                if(ch =='('||ch == '['){
                    stack.push(ch);
                }else {
                    if(ch == ')'){
                        if (!stack.empty() && stack.peek() == '(') {
                            stack.pop();
                        }else{
                            stack.push(ch);
                        }
                    } else if (ch == ']') {
                        if (!stack.empty() && stack.peek() == '[') {
                            stack.pop();
                        }else{
                            stack.push(ch);
                        }
                    }
                }
            }
            if(stack.empty()){
                bw.write("yes\n");
            }else{
                bw.write("no\n");
            }
            str = br.readLine();
        }while(!str.equals("."));



        bw.flush();
        bw.close();
        br.close();
    }
}
