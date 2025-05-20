import java.util.Scanner;

public class algorithmClass3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 이중 반복문이기때문에 빅오 표기법으로 O(n^2)일 것이다.
        //즉 수행 횟수는 n^2 차수는 2이다.
        //정해진 입력의 최댓값인 50만의 제곱은 2500억 이기 때문에 long형.
        //int * int 는 int 형을 반환함으로 2500억을 담을 수 없어 오버플로우가 남
        long n = input.nextLong();

        System.out.println(n*n);
        System.out.println("2");
    }
}
