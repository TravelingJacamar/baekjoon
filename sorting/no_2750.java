import java.util.Scanner;

public class no_2750 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arr = new int[N];

        for(int i = 0;i<N;i++){
            arr[i] = input.nextInt();
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

        for(int i =0;i<N;i++){
            System.out.println(arr[i]);
        }
    }


}

