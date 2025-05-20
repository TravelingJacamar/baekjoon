import java.util.Scanner;

public class algorithmClassBigO1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //f(n) = a1n +a0  이기에 g(n) 은 그냥 n 이다.
        //이때 입력 c 를 받고 n0를 입력받아 n0에 대해 정의 식에 대입하여 비교하고 결과 출력
        int a1 = input.nextInt();
        int a0 = input.nextInt();
        int c = input.nextInt();
        int n0 = input.nextInt();
        //n>n0 이 성립함을 봐야함. 1<=n<=100
        int result=0;
        for(int i = n0;i<=100;i++) {
            result = a1 * i + a0 <= c * i ? 1 : 0;
            if(result ==0){
                break;
            }
        }
        System.out.println(result);
    }
}
