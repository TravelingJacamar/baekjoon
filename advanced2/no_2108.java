import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class no_2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int sum =0;
        int[] arr = new int[N];
        Map<Integer,Integer> map = new HashMap<>();

        //배열에 입력받기
        for(int i=0;i<N;i++){
            int n = Integer.parseInt(br.readLine());
            arr[i]= n;
            sum += n;
            //map 으로 빈도수도 같이 저장.
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        //산술평균
        int average =  Math.round((float)sum/N);
        //정렬
        Arrays.sort(arr);
        //중앙값
        int mid = arr[N/2];
        //최빈값 최빈값이 여러개 일 경우 2번째로 작은수
        int mode = 0;
        int maxCnt =0;
        for(int key : map.keySet()){
            int value = map.get(key);
            if(value > maxCnt){
                maxCnt = value;
            }
        }
        int countMaxCnt =0;
        int[] modeArr = new int[N];
        //정렬을 사용하기 위해 가장 큰 값인 400보다 1큰 4001 로 초기화
        for(int i=0;i<N;i++){
            modeArr[i]= 4001;
        }
        int i =0;
        for(int key : map.keySet()){
            int value = map.get(key);
            if(value == maxCnt){
                modeArr[i]= key;
                i++;
            }
        }
        Arrays.sort(modeArr);
        if(arr.length>1&&modeArr[1]!=4001){
            mode = modeArr[1];
        }else{
            mode=modeArr[0];
        }

        //범위
        int range = arr[N-1]-arr[0];


        bw.write(average+"\n"
                +mid+"\n"
                +mode+"\n"
                +range);
        bw.flush();
        bw.close();
        br.close();
    }
}
