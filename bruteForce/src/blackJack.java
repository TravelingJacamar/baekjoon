import java.util.Scanner;

public class blackJack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //브루트포스란 가능한 모든 경우의 수를 시도하는 것
        //N = 카드의 갯수 (배열의 크기)
        //M 을 넘지 않으면서 가장 큰 값을 만드는 3장의 합.


        int N = input.nextInt();
        int M = input.nextInt();

        int[] arr = new int[N];


        int maxSum=0;

        for(int i =0;i<N;i++){
            arr[i]= input.nextInt();
        }

        for(int i =0;i<N;i++){
            int sum =0;

            if(sum+arr[i]<=M&&sum<arr[i]+sum){
                sum += arr[i];
            }else{
                continue;
            }

            for(int j = i+1;j<N;j++) {
                if(sum+arr[j]<=M&&sum<arr[j]+sum) {
                    sum += arr[j];
                }else{
                    continue;
                }
                for(int k = j+1;k<N;k++){
                    if(sum+arr[k]<=M) {
                        sum += arr[k];
                        if(maxSum<sum){
                            maxSum = sum;
                        }
                        sum -=arr[k];
                }
                }
                sum -= arr[j];
            }


        }


        System.out.println(maxSum);


    }
}
