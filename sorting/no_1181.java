import java.io.*;

public class no_1181 {
    public static void main(String[] args) throws IOException {
        //맵을 사용하면 쉬울 것 같긴 하지만. 일단 자료구조 안쓰고 풀어본다
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for(int i=0;i<N;i++){
            arr[i] = br.readLine();
        }
        //길이에 따른 정렬
        mergeSort(arr,0,arr.length-1);



        for(int i =0;i<=N-1;i++) {
            // || 연산자는 앞에 조건이 참이면 뒤에 조건은 보지 않음 즉 arr[i-1] 을 확인할 생각조차 하지 않기때문에
            // index 에러 안뜸
            if (i == 0 || arr[i].length()!=arr[i-1].length()||Compare(arr[i],arr[i-1])!=0){
            bw.write(arr[i] + "\n");
            }

        }
        bw.flush();
        bw.close();
        br.close();


    }
    private static void mergeSort(String[] arr,int left,int right){
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);


    }
    private static void merge(String[] arr,int left,int mid,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] leftTemp = new String[n1];
        String[] rightTemp = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftTemp[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightTemp[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            //길이로 정렬
            if (leftTemp[i].length() < rightTemp[j].length()) {
                arr[k] = leftTemp[i];
                i++;
            } else if (leftTemp[i].length() == rightTemp[j].length()) {
                if(Compare(leftTemp[i],rightTemp[j])>0){
                    arr[k] = rightTemp[j];
                    j++;
                }else{
                    arr[k] = leftTemp[i];
                    i++;
                }
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
            //문자열 비교 자체제작
    /**
     * 같으면 0 첫번째가 더 작으면 -1 두번째께 더 작으면 1 즉 1이 되면 스왑해야함.
     * */
    private static int Compare(String s1,String s2){
            for(int i = 0 ;i<s1.length();i++){
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                if(c1 == c2){
                    if(i == s1.length()-1){
                        //같은 문자열
                        return 0;
                    }else{
                        continue;
                    }
                }else if (c1<c2) {
                    return -1;

                }else{
                    return 1;
                }
            }
            return 0;
    }


}

