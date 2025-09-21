import java.util.Scanner;

public class no_27433 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();
        long result =factorial(n);
        System.out.println(result);
    }
    private static long factorial(long n){
        if(n <=1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
