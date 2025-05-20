import java.util.Scanner;

public class algorithmClass6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //이번엔 코드를 돌려서 cnt를 찾아볼까한다.
        // 빅오는 n^3이 나올 것은 명확하기에 일단 long형으로 하겠다.
        long n = input.nextLong();
        /*long n = input.nextLong();
        long cnt=0;
        for(long i=1;i<=n-2;i++){
            for(long j=i+1;j<=n-1;j++){
                for(long k=j+1;k<=n;k++){
                    cnt++;
                }
            }
        }*/
        //이코드를 돌리면 시간초과가 난다 즉 수식으로 간단하게 해야한다는것
        //n(n-1)(n-2)/6 이다.
        System.out.println(n*(n-1)*(n-2)/6);
        System.out.println("3");


    }
}
