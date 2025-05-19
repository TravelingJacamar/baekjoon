import java.util.Scanner;

public class getDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int k = input.nextInt();
        int cnt =0;
        for(int i = 1;i<=p;i++){
            if(p%i==0){
                cnt++;
            }

            if(cnt==k){
                System.out.println(i);
                break;
            }
        }
        if(cnt<k){
            System.out.println("0");
        }


    }
}
