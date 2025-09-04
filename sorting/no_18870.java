import java.io.*;
import java.util.StringTokenizer;


public class no_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //수의 갯수
        int N = Integer.parseInt(br.readLine());
        //숫자를 공백기준으로 자르기 위해 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int[] tmp = new int[N];

        for(int i =0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            tmp[i] = arr[i];
        }
        // tmp 배열을 정렬하여 중복되는 구간의 객수를 셀 것임.
        mergeSort(tmp,0,arr.length-1);

        int count = countSameNum(tmp);
        code[] cArr = new code[count];
        int t=1;

        cArr[0] = new code(tmp[0],0);

         for(int i = 1;i<N;i++){
                if(tmp[i]!=tmp[i-1]){
                 cArr[t] = new code(tmp[i],t);
                 t++;
                }
         }

        for(int i =0;i<N;i++){
            int idx = binarySearch(cArr,0,cArr.length-1,arr[i]);
            if(idx != -1){
            bw.write(cArr[idx].compress+" ");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
    private static int binarySearch(code[] arr, int low,int high,int target) {
        int mid = low + (high - low) / 2;

        if (low > high) {
            return -1;
        }
        if (target == arr[mid].value) {
            return mid;
        }

        if (target < arr[mid].value) {
            return binarySearch(arr, low, mid-1, target);
        } else {
            return binarySearch(arr, mid+1, high, target);
        }
    }

    private static int countSameNum(int[] arr){
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                count++;
            }
        }
        return count;

    }

    static class code{
        int value=0;
        int compress=0;

        public code(int value,int compress){
            this.value=value;
            this.compress=compress;
            }
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
        }
        while (i < n1) {
            arr[k] = leftTemp[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightTemp[j];
            j++;
            k++;
        }
    }

}
