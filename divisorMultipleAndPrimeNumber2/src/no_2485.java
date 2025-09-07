import java.io.*;

public class no_2485 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //입력의 수
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        //이미 있는 가로수 배열로 입력 받기
         for(int i =0;i<N;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
         //생각한 방안. 각 가로수 사이의 빈 공간을 찾고 그 빈공간들의 최대공약수 를 찾을 후
        //그 공약수 길이에 맞게 추가하기.

        //각각의 가로수 사이의 길이를 저장할 배열.
        int[] arr2 = new int[N-1];
         for(int i =0;i<N-1;i++){
           arr2[i] = arr1[i+1]-arr1[i];
         }
        //가로수 사이의 길이들의 최대공약수 구하기.
        int divisor = 0;
        for(int i=0;i<N-2;i++){
            int tmp = euclidean(arr2[i],arr2[i+1]);
            arr2[i+1] = tmp;
            if(i==N-3){
                divisor = tmp;
            }
        }
        //이제 갯수세기
        int count = 0;
        for(int i =1;i<N;i++){
            do{
                arr1[i-1] += divisor;
                if(arr1[i-1]<arr1[i]){
                    count++;
                }
            }while(arr1[i-1]<arr1[i]);
        }

        bw.write(count+"");

         bw.flush();
         bw.close();
         br.close();



    }
    public static int euclidean(int a,int b){
        if(a<b){
            int tmp = a;
            a=b;
            b=tmp;
        }
        int Q = a/b;
        int R = a%b;
        if(R == 0){
            return b;
        }else{
            return euclidean(b,R);
        }
    }
}
