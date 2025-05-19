import java.util.Scanner;

public class findPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //소수는 자기자신과 1 이외의 수로 나누어지지 않는 것.
        int num = input.nextInt();
        int cnt = 0;

        for(int i=0;i<num;i++){
            int n= input.nextInt();
            boolean tf =true;
            if(n!=1){
            for(int j=2;j<n;j++){
                if(n%j==0){
                    tf=false;
                }
            }
            if(tf){
                cnt++;
            }
            }
        }
        System.out.println(cnt);


    }
}
