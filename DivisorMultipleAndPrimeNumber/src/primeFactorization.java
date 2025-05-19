import java.util.Scanner;
public class primeFactorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 소인수 분해면 일단 나누기를 해줘야하고.
        // 나누는 수가 소수여야하고 몫이 1일 떄 까지 해야함.

        //일단 입력받기
        int num = input.nextInt();
        int result = num;
        //이제 계산
        for(int i = 2;i<=num;i++){
            boolean tf = true;

            while(result%i==0) {
                    System.out.println(i);
                    result /= i;
            }



        }
    }
}
