import java.util.Scanner;

public class no_2587 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = 5;
        int[] arr = new int[N];
        int sum = 0;

        for(int i = 0;i<N;i++){
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                if (arr[i]<arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        int ave = sum/5;

        int mid = arr[2];
        System.out.println(ave);
        System.out.println(mid);


    }
}

