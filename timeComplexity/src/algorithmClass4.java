import java.util.Scanner;

public class algorithmClass4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //가장 안에 있는 for 문의 반복 횟수는 n - i - 1  그 위의 for문은 n-1 번
        //즉 n(n-1)/2 이다. 빅오 표기법으로는 O(n^2)이다.
        //이것도 최대 입력 50만 이니 long형으로

        long n = input.nextLong();

        System.out.println(n*(n-1)/2);
        System.out.println("2");

    }
}
