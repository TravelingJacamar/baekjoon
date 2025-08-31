import java.io.*;
import java.util.StringTokenizer;

public class no_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //입력 줄 수
        int N = Integer.parseInt(br.readLine());
        // 좌표 목록 입력 받기
        Point[] arr = new Point[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i]= new Point();
            arr[i].x = Integer.parseInt(st.nextToken());
            arr[i].y = Integer.parseInt(st.nextToken());

        }
        //정렬
        mergeSort(arr,0,arr.length-1);
        //출력
        for(int i=0;i<N;i++){
            bw.write(arr[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
    private static void mergeSort(Point[] arr,int left,int right){
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);


    }
    private static void merge(Point[] arr,int left,int mid,int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Point[] leftTemp = new Point[n1];
        Point[] rightTemp = new Point[n2];

        for (int i = 0; i < n1; i++) {
            leftTemp[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightTemp[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftTemp[i].x < rightTemp[j].x) {
                arr[k] = leftTemp[i];
                i++;
            }else if (leftTemp[i].x == rightTemp[j].x) {
                if (leftTemp[i].y < rightTemp[j].y) {
                    arr[k] = leftTemp[i];
                    i++;
                }else {
                    arr[k] = rightTemp[j];
                    j++;
                }
            }else{
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
        static class Point {
            int x = 0;
            int y = 0;

            @Override
            public String toString() {
                return x + " " + y;
            }
        }

    }



