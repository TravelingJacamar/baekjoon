import java.io.*;
import java.util.StringTokenizer;

public class no_24060 {
    static int cnt = 0;
    static  int K =0;
    static  int result =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]= Integer.parseInt(st2.nextToken());
        }
        mergeSort(arr,0,N-1);
        if(cnt >= K){
            bw.write(result+"");
        }else{
            bw.write("-1");
        }
        bw.flush();
        bw.close();
        br.close();

    }
    private static void mergeSort(int[] arr,int left,int right){
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    private static void merge(int[] arr,int left,int mid,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftTemp = new int[n1];
        int[] rightTemp = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftTemp[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightTemp[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftTemp[i] <= rightTemp[j]) {
                arr[k] = leftTemp[i];
                i++;
            } else {
                arr[k] = rightTemp[j];
                j++;
            }
            k++;
            cnt++;
            if(cnt == K){
                result = arr[k-1];
            }

        }
        while (i < n1) {
            arr[k] = leftTemp[i];
            i++;
            k++;
            cnt++;
            if(cnt == K){
                result = arr[k-1];
            }
        }

        while (j < n2) {
            arr[k] = rightTemp[j];
            j++;
            k++;
            cnt++;
            if(cnt == K){
                result = arr[k-1];
            }
        }
    }
}
