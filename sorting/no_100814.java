import java.io.*;
import java.util.StringTokenizer;

public class no_100814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        User[] arr = new User[N];
        for(int i = 0;i<N;i++) {
            String in = br.readLine();
            StringTokenizer st = new StringTokenizer(in);
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arr[i] = new User(age,name);
        }
        mergeSort(arr,0, arr.length-1);

        for(int i=0;i< arr.length;i++){
            bw.write(arr[i]+"");
        }
        bw.flush();
        bw.close();
        br.close();


    }
    private static void mergeSort(User[] arr,int left,int right){
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);


    }
    private static void merge(User[] arr,int left,int mid,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        User[] leftTemp = new User[n1];
        User[] rightTemp = new User[n2];

        for (int i = 0; i < n1; i++) {
            leftTemp[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightTemp[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            //나이순 병합
            if (leftTemp[i].age <= rightTemp[j].age) {
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

    static class User{
         int age;
         String name;

        public User(int age , String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age+" "+name+"\n";
        }
    }

}
