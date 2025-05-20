import java.util.Scanner;

public class algorithmClass1 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int n = input.nextInt();

            //빅오 표기법으로 하였을때 O(1) 이다. n 과 상관없이 무조건 1번 수행된다.
            //즉 차수는 항상 0 이고 수행 횟수는 항상 1이다.
        System.out.println("1");
        System.out.println("0");
    }
}
