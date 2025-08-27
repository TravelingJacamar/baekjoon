import java.util.Scanner;
public class no_2839 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int result = -1;

        for(int i =0;i<=N/5;i++){
            int tmp = N;
            tmp -= 5*i;
            if(tmp % 3==0){
                 result = i + tmp/3;
            }
        }

        System.out.println(result);


    }
}
