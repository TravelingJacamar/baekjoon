import java.util.Scanner;

public class algorithmClass5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //이번엔 n^3 이다. 빅오표기법도 같다. 이번에도 long

        long n = input.nextLong();
        System.out.println(n*n*n);
        System.out.println("3");

    }
}
