import java.io.*;
import java.util.Set;
import java.util.HashSet;

public class no_11478 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String input = br.readLine();
            char[] arr = input.toCharArray();
            Set<String> result = new HashSet<>();

            // 길이에 따라 단어를 만들고 set에 넣어서 set 의 size 가 답이다.
            //Point! 어떻게 연속된 문자열를 만들 것인가.
            //브루트포스 느낌 으로 다 해보자. 2 중첩 for 문이면 시간복잡도 가능할 것 같다.
            for(int i =0;i< arr.length;i++){
                String tmp = arr[i]+"";
                for(int j =i+1;j<arr.length;j++){
                        result.add(tmp);
                        tmp = tmp + arr[j];
                }
                result.add(tmp);
            }

            bw.write(result.size()+"");
            bw.flush();
            bw.close();
            br.close();

    }
}
