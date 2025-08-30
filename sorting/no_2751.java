import java.io.*;

public class no_2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }


        mergeSort(arr,0,arr.length-1);

        for(int i=0;i<N;i++){
            bw.write(arr[i]+"\n");
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
