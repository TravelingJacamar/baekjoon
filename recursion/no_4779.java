import java.io.*;

public class no_4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while((line = br.readLine()) != null){
            int N = Integer.parseInt(line);
            int len = (int)Math.pow(3,N);
            StringBuilder sb = new StringBuilder("-".repeat(len));
            Cantor(sb,0,len);
            bw.write(sb.toString()+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static void Cantor(StringBuilder sb,int start,int length) {
        if(length ==1){
            return;
        }
            int len = length /3;
            for(int i =start+len;i<start+len*2;i++){
                sb.setCharAt(i,' ');
            }
            Cantor(sb,start,len);
            Cantor(sb,start+len*2,len);

    }
}
