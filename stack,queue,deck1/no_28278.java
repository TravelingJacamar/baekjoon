import java.util.Stack;
import java.io.*;
import java.util.StringTokenizer;

public class no_28278 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            switch(order){
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case 2:
                    if(stack.empty()){
                        bw.write(-1+"\n");
                    }else{
                        bw.write(stack.pop()+"\n");
                    }
                    break;
                    case 3:

                        bw.write(stack.size()+"\n");
                        break;
                        case 4:
                            if(stack.empty()){
                                bw.write(1+"\n");
                            }else{
                                bw.write(0+"\n");
                            }
                            break;
                            case 5:
                                //정수가 있다면 맨위의 정수를 출력한다.
                                if(!stack.empty()){
                                    bw.write(stack.peek()+"\n");
                                }else{
                                    bw.write(-1+"\n");
                                }
                                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
