import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
    }
    private static int binarySearch(int[] arr, int high,int low,int target) {
        int mid = (high + low) / 2;

        if (target == arr[mid]) {
            return mid;
        }
        if (low < high) {
            return -1;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, mid - 1, low, target);
        } else {
            return binarySearch(arr, high, mid + 1, target);
        }



    }
}
