import java.io.*;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;

public class no_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> rainbowDancers = new HashSet<>();

        rainbowDancers.add("ChongChong");

        for(int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();

            if(rainbowDancers.contains(name1)){
                rainbowDancers.add(name2);
            }else if(rainbowDancers.contains(name2)){
                rainbowDancers.add(name1);
            }
        }

        int count = rainbowDancers.size();
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();


    }
}
