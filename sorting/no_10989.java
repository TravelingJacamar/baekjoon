import java.io.*;
public class no_10989 {
    public static void main(String[] args) throws IOException{
        //카운팅 정렬이 효괴적이라는 말에 따라 카운팅 정렬로 해보겠음.
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            //숫자갯수

            int N = Integer.parseInt(input.readLine());


            //카운팅할 배열 수는 10000 보다 작거나 같은 자연수임
            int[] count = new int[10001];
            //입력받을 숫자 배열
            int[] array = new int[N];
            //입력
            for(int i =0;i<N;i++){
                int num = Integer.parseInt(input.readLine());
                array[i] = num;
                count[num]++;
            }
            //count 배열의 누적합 변경
            int cnt = 0;
            for(int i=0;i<10001;i++){
                cnt += count[i];
                count[i] = cnt;
            }

            //출력을 위한 result 배열
            int[] result = new int[N];

            for(int i =0;i<N;i++){
                count[array[i]]--;
                result[count[array[i]]] = array[i];
            }
            //입출력 시간 단축을 위한 StringBulider

            for(int i = 0;i<N;i++){
                bw.write(result[i]+"\n");
            }
            bw.flush();
            bw.close();
            input.close();



    }
}
